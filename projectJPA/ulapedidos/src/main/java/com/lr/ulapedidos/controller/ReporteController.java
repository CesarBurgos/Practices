package com.lr.ulapedidos.controller;

import com.lr.ulapedidos.dto.ApiResponse;
import com.lr.ulapedidos.repository.DetallePerdidoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.lr.ulapedidos.util.UtilConstants;

@RestController
@RequestMapping("/api/reportes")
@RequiredArgsConstructor
public class ReporteController {
    private final DetallePerdidoRepository repository;

    @GetMapping("/top-vendidos")
    public ResponseEntity<ApiResponse<?>> topVendidos(){
        return ResponseEntity.ok(new ApiResponse<>(true, UtilConstants.MSG1, repository.topVendidos()));
    }
}
