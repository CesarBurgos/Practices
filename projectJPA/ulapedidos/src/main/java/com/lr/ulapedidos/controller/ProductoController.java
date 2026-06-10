package com.lr.ulapedidos.controller;

import com.lr.ulapedidos.dto.ApiResponse;
import com.lr.ulapedidos.model.ProductoModel;
import com.lr.ulapedidos.service.ProductoService;
import com.lr.ulapedidos.util.UtilConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.lr.ulapedidos.UlapedidosApplication;

import java.util.Map;

@RestController
@RequestMapping("/api/productos")
@RequiredArgsConstructor
public class ProductoController {
    private final ProductoService service;

    @PostMapping
    public ResponseEntity<ApiResponse<?>> guardar(@RequestBody ProductoModel producto){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG2, service.guardar(producto)));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<?>> listar(){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG1, service.listar()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(new ApiResponse<>(true,UtilConstants.MSG1, service.buscarPorId(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> actualizar(@PathVariable Integer id, @RequestBody ProductoModel producto){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG3, service.actualizar(id, producto)));
    }

    @PutMapping("/{id}/stock")
    public ResponseEntity<ApiResponse<?>> actualizarStock(@PathVariable Integer id, @RequestBody Map<String, Integer> request){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG4, service.actualizarStock(id, request.get(UtilConstants.CODE1))));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG5, null));
    }
}
