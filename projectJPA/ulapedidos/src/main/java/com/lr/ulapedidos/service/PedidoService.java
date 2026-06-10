package com.lr.ulapedidos.service;

import com.lr.ulapedidos.dto.DetallePedidoResponseDTO;
import com.lr.ulapedidos.dto.PedidoRequest;
import com.lr.ulapedidos.dto.PedidoResponseDTO;
import com.lr.ulapedidos.dto.ProductoPedidoDTO;
import com.lr.ulapedidos.model.ClienteModel;
import com.lr.ulapedidos.model.DetallePedidoModel;
import com.lr.ulapedidos.model.PedidoModel;
import com.lr.ulapedidos.model.ProductoModel;
import com.lr.ulapedidos.repository.ClienteRepository;
import com.lr.ulapedidos.repository.DetallePerdidoRepository;
import com.lr.ulapedidos.repository.PedidoRepository;
import com.lr.ulapedidos.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.lr.ulapedidos.util.UtilConstants;
import java.math.BigDecimal;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PedidoService {
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final ProductoRepository productoRepository;
    private final DetallePerdidoRepository detalleRepository;

    @Transactional // Congela la BD hasta que se ejecute, y si todo sale bien hace el commit
    public PedidoModel generarPedido(PedidoRequest request){
        ClienteModel cliente = clienteRepository.findById(request.getIdCliente()).orElseThrow(()-> new RuntimeException(UtilConstants.MSG15));

        PedidoModel pedido = new PedidoModel();
        pedido.setCliente(cliente);
        pedido.setEstadoPedido(UtilConstants.CODE2);
        BigDecimal total = BigDecimal.ZERO;
        pedido = pedidoRepository.save(pedido);

        for(ProductoPedidoDTO item: request.getProductos()){
            ProductoModel producto = productoRepository.findById(item.getIdProducto()).orElseThrow(() -> new RuntimeException(UtilConstants.MSG16));

            if(producto.getStock() < item.getCantidad()){
                throw new RuntimeException(UtilConstants.MSG17 + producto.getNombre());
            }

            BigDecimal subtotal = producto.getPrecio().multiply(BigDecimal.valueOf(item.getCantidad()));
            total = total.add(subtotal);

            DetallePedidoModel detalle = new DetallePedidoModel();
            detalle.setPedido(pedido);
            detalle.setProducto(producto);
            detalle.setCantidad(item.getCantidad());
            detalle.setPrecioUnitario(producto.getPrecio());
            detalle.setSubtotal(subtotal);

            detalleRepository.save(detalle);

            producto.setStock(producto.getStock() - item.getCantidad());

            productoRepository.save(producto);
        }

        pedido.setTotal(total);

        return pedidoRepository.save(pedido);
    }

    @Transactional
    public void cancelarPedido(Integer idPedido){
        PedidoModel pedido = pedidoRepository.findById(idPedido).orElseThrow(() -> new RuntimeException(UtilConstants.MSG18));

        pedido.setEstado(UtilConstants.CODENEG);
        pedido.setEstadoPedido(UtilConstants.CODE3);

        var detalles = detalleRepository.findByPedidoIdPedido(idPedido);

        for(DetallePedidoModel detalle:detalles){
            ProductoModel producto = detalle.getProducto();
            producto.setStock(producto.getStock() + detalle.getCantidad());

            productoRepository.save(producto);
        }

        pedidoRepository.save(pedido);
    }

    public List<PedidoResponseDTO> listarPedidosPorCliente(Integer idCliente){
        // 1) Buscamos los pedidos activos del cliente (CODEP0S es 1 según las constantes)
        List<PedidoModel> pedidos = pedidoRepository.findByClienteIdClienteAndEstado(idCliente, UtilConstants.CODEPOS);

        // 2) Mapeamos la lista de entidades a la lista de DTOs
        return pedidos.stream().map(pedido -> {
            PedidoResponseDTO dto = new PedidoResponseDTO();

            dto.setIdPedido(pedido.getIdPedido());
            dto.setFechaPedido(pedido.getFechaPedido());
            dto.setTotal(pedido.getTotal());
            dto.setEstadoPedido(pedido.getEstadoPedido());

            // Mapear los detalles de este pedido
            List<DetallePedidoResponseDTO> detallesDTO = pedido.getDetalles().stream()
                    .filter(d -> d.getEstado().equals(UtilConstants.CODEPOS)) // Solo detalles ACTIVOS
                    .map(detalle -> {
                        DetallePedidoResponseDTO dDTO = new DetallePedidoResponseDTO();
                        dDTO.setIdDetalle(detalle.getIdDetalle());
                        dDTO.setIdProducto(detalle.getProducto().getIdProducto());
                        dDTO.setNombreProducto(detalle.getProducto().getNombre());
                        dDTO.setCantidad(detalle.getCantidad());
                        dDTO.setPrecioUnitario(detalle.getPrecioUnitario());
                        dDTO.setSubtotal(detalle.getSubtotal());

                        return dDTO;
                    }).toList();

            dto.setDetalles(detallesDTO);
            return dto;
        }).toList();
    }

    public List<PedidoResponseDTO> listarTodos(){
        List<PedidoModel> pedidos = pedidoRepository.findAll();
        return mapearAListaDTO(pedidos);
    }

    public List<PedidoResponseDTO> listarPorEstado(Integer estado){
        // Buscamos los pedidos por su estado (0 o 1)
        List<PedidoModel> pedidos = pedidoRepository.findByEstado(estado);
        return mapearAListaDTO(pedidos);
    }

    // Método auxiliar privado para reutilizar el mapo a DTO y no duplicar código
    private List<PedidoResponseDTO> mapearAListaDTO(List<PedidoModel> pedidos){
        return pedidos.stream().map( pedido -> {
            PedidoResponseDTO dto = new PedidoResponseDTO();
            dto.setIdPedido(pedido.getIdPedido());
            dto.setFechaPedido(pedido.getFechaPedido());
            dto.setTotal(pedido.getTotal());
            dto.setEstadoPedido(pedido.getEstadoPedido());
            dto.setIdCLiente(pedido.getCliente().getIdCliente());
            dto.setEstado(pedido.getEstado());

            // Guardamos el estado numerico (0 a 1) en una propiedad si tu DTO lo tiene
            // o simplemente confiamos en las relaciones

            List<DetallePedidoResponseDTO> detallesDTO = pedido.getDetalles().stream()
                    .filter(d -> d.getEstado().equals(UtilConstants.CODEPOS))
                    .map(detalle -> {
                        DetallePedidoResponseDTO dDTO = new DetallePedidoResponseDTO();

                        dDTO.setIdDetalle(detalle.getIdDetalle());
                        dDTO.setIdProducto(detalle.getProducto().getIdProducto());
                        dDTO.setNombreProducto(detalle.getProducto().getNombre());
                        dDTO.setCantidad(detalle.getCantidad());
                        dDTO.setPrecioUnitario(detalle.getPrecioUnitario());
                        dDTO.setSubtotal(detalle.getSubtotal());

                        return dDTO;
                    }).toList();
            dto.setDetalles(detallesDTO);
            return dto;
        }).toList();
    }
}
