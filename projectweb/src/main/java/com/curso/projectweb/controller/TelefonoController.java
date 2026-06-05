package com.curso.projectweb.controller;

import com.curso.projectweb.dto.ResponsesDto;
import com.curso.projectweb.dto.TelefonoRequestDto;
import com.curso.projectweb.service.ITelefonoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.curso.projectweb.util.Util;

@RestController
@RequestMapping("/api/v1/clientes/telefonos")
@RequiredArgsConstructor
public class TelefonoController {
    private final ITelefonoService service;

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

    @GetMapping("/cliente/{idCliente}")
    public ResponsesDto getByCliente(@PathVariable String idCliente){
        return ok(service.getByCliente(idCliente));
    }

    @GetMapping("/{id}")
    public ResponsesDto getById(@PathVariable String id){
        return ok(service.getById(id));
    }

    @PostMapping
    public ResponsesDto create(@Valid @RequestBody TelefonoRequestDto dto){
        return ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponsesDto update(@PathVariable String id, @Valid @RequestBody TelefonoRequestDto dto){
        return ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponsesDto delete(@PathVariable String id){
        service.delete(id);

        return ok("Teléfono elimiando correctamente");
    }
}
