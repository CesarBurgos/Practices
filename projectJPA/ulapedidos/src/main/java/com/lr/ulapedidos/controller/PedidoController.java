package com.lr.ulapedidos.controller;

import com.lr.ulapedidos.dto.ApiResponse;
import com.lr.ulapedidos.dto.PedidoRequest;
import com.lr.ulapedidos.dto.PedidoResponseDTO;
import com.lr.ulapedidos.service.PedidoService;
import com.lr.ulapedidos.util.UtilConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@RequiredArgsConstructor
public class PedidoController {
    private final PedidoService service;

    @PostMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> generarPedido(@RequestBody PedidoRequest request){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG6, service.generarPedido(request)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> cancelarPedido(@PathVariable Integer id){
        service.cancelarPedido(id);
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG7, null));
    }

    @GetMapping("/cliente/{idCliente}")
    public ResponseEntity<ApiResponse<List<PedidoResponseDTO>>> listarPorCliente(@PathVariable Integer idCliente){
        List<PedidoResponseDTO> pedidos = service.listarPedidosPorCliente(idCliente);
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG1, pedidos));
    }

    // 1) Filtrar por TODOS los pedidos del sistema
    @GetMapping
    public ResponseEntity<ApiResponse<List<PedidoResponseDTO>>> listarTodos(){
        List<PedidoResponseDTO> lista = service.listarTodos();
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG1, lista));
    }

    @GetMapping("/estado/{estado}")
    public ResponseEntity<ApiResponse<List<PedidoResponseDTO>>> listarTodos(@PathVariable Integer estado){
        List<PedidoResponseDTO> lista = service.listarPorEstado(estado);
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG1, lista));
    }
}
