package com.lr.ulapedidos.service;

import com.lr.ulapedidos.model.ProductoModel;
import com.lr.ulapedidos.repository.ProductoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import com.lr.ulapedidos.util.UtilConstants;

@Service
@RequiredArgsConstructor
public class ProductoService {
    private final ProductoRepository repository;

    public ProductoModel guardar(ProductoModel producto){
        return repository.save(producto);
    }

    public List<ProductoModel> listar(){
        return repository.findByEstado(UtilConstants.CODEPOS);
    }

    public ProductoModel buscarPorId(Integer id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException(UtilConstants.MSG16));
    }

    public ProductoModel actualizar(Integer id, ProductoModel request){
        ProductoModel producto = buscarPorId(id);

        producto.setNombre(request.getNombre());
        producto.setDescripcion(request.getDescripcion());
        producto.setPrecio(request.getPrecio());
        producto.setStock(request.getStock());
        producto.setUrlImagen(request.getUrlImagen());
        producto.setCategoria(request.getCategoria());

        return repository.save(producto);
    }

    public ProductoModel actualizarStock(Integer id, Integer stock){
        ProductoModel producto = buscarPorId(id);
        producto.setStock(stock);

        return repository.save(producto);
    }

    public void eliminar(Integer id){
        ProductoModel producto = buscarPorId(id);
        producto.setEstado(UtilConstants.CODENEG);

        repository.save(producto);
    }
}
