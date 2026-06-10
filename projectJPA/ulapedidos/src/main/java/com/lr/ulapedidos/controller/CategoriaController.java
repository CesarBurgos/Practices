package com.lr.ulapedidos.controller;
import com.lr.ulapedidos.dto.ApiResponse;
import com.lr.ulapedidos.model.CategoriaModel;
import com.lr.ulapedidos.service.CategoriaService;
import com.lr.ulapedidos.util.UtilConstants;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/categorias")
@RequiredArgsConstructor
public class CategoriaController {
    private final CategoriaService service;

    @PostMapping
    public ResponseEntity<ApiResponse<?>> guardar(@RequestBody CategoriaModel categoria){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG11, service.guardar(categoria)));
    }

    @GetMapping
    public ResponseEntity<ApiResponse<?>> listar(){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG11, service.listar()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> buscarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG11, service.buscarPorId(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> actualizar(@PathVariable Integer id, @RequestBody CategoriaModel categoria){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG12, service.actualizar(id, categoria)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<?>> eliminar(@PathVariable Integer id){
        service.eliminar(id);
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG13, null));
    }
}
