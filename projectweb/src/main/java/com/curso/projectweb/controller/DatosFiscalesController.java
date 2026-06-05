package com.curso.projectweb.controller;

import com.curso.projectweb.dto.DatosFiscalesRequestDto;
import com.curso.projectweb.dto.DatosFiscalesResponseDto;
import com.curso.projectweb.dto.ResponsesDto;
import com.curso.projectweb.service.IDatosFiscalesService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.curso.projectweb.util.Util;

@RestController
@RequestMapping("/api/v1/clientes/datfis")
@RequiredArgsConstructor
public class DatosFiscalesController {
    private final IDatosFiscalesService service;

    private ResponsesDto ok(Object data){
        ResponsesDto res = new ResponsesDto();

        res.setSuccess(true);
        res.setMensaje(Util.OKQUERY);
        res.setError(null);
        res.setData(data);

        return res;
    }

    @GetMapping
    public ResponsesDto getAll(){
        return ok(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponsesDto getById(@PathVariable String id){
        return ok(service.getById(id));
    }

    @PostMapping
    public ResponsesDto create(@Valid @RequestBody DatosFiscalesRequestDto dto){
        return ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponsesDto update(@PathVariable String id, @Valid @RequestBody DatosFiscalesRequestDto dto){
        service.delete(id);

        return ok("Datos Fiscales Desactivados Correctamente");
    }
}