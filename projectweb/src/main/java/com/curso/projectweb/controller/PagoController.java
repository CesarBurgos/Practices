package com.curso.projectweb.controller;

import com.curso.projectweb.dto.PagoRequestDto;
import com.curso.projectweb.dto.ResponsesDto;
import com.curso.projectweb.service.IPagoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.curso.projectweb.util.Util;

@RestController
@RequestMapping("/api/v1/clientes/pagos")
@RequiredArgsConstructor
public class PagoController {
    private final IPagoService service;

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

    @GetMapping("/factura/{idFactura}")
    public ResponsesDto getByFactura(@PathVariable String idFactura){
        return ok(service.getByFactura(idFactura));
    }

    @GetMapping("/{id}")
    public ResponsesDto getById(@PathVariable String id){
        return ok(service.getById(id));
    }

    @PostMapping
    public ResponsesDto create(@Valid @RequestBody PagoRequestDto dto){
        return ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponsesDto update(@PathVariable String id, @Valid @RequestBody PagoRequestDto dto) {
        return ok(service.update(id, dto));
    }
}
