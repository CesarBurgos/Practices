package com.curso.projectweb.controller;

import com.curso.projectweb.dto.ClienteRequestDto;
import com.curso.projectweb.dto.ClienteResponseDto;
import com.curso.projectweb.dto.ResponsesDto;
import com.curso.projectweb.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.curso.projectweb.util.Util;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService service;

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
        List<ClienteResponseDto> data = service.getAll();
        return ok(data);
    }

    @GetMapping("{id}")
    public ResponsesDto getById(@PathVariable String id){
        return ok(service.getById(id));
    }

    @PostMapping
    public ResponsesDto create(@Valid @RequestBody ClienteRequestDto dto){
        return ok(service.create(dto));
    }

    @PutMapping("/{id}")
    public ResponsesDto update(@PathVariable String id, @Valid @RequestBody ClienteRequestDto dto){
        return ok(service.update(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponsesDto delete(@PathVariable String id){
        service.delete(id);
        return ok("Cliente eliminado correctamente");
    }

}
