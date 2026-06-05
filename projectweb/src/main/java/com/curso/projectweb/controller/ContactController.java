package com.curso.projectweb.controller;

import com.curso.projectweb.dto.RequestMessageDto;
import com.curso.projectweb.dto.ResponsesDto;
import com.curso.projectweb.service.IContactMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import com.curso.projectweb.util.Util;

@RestController
@RequestMapping("/api/v1/message")
@RequiredArgsConstructor
public class ContactController {
    private final IContactMessageService service;

    private ResponsesDto buildResponse(Boolean success, String mensaje, Object data){
        ResponsesDto res = new ResponsesDto();
        res.setSuccess(success);
        res.setMensaje(mensaje);
        res.setData(data);

        return res;
    }

    // 1) Crear Mensaje
    @PostMapping("/create")
    public ResponsesDto create(@RequestBody RequestMessageDto dto){
        service.create(dto);

        return buildResponse(Util.OKSUCCESS, Util.OKQUERY, null);
    }

    // 2) Marcar como leído
    @PostMapping("/read")
    public ResponsesDto markAsRead(@RequestBody RequestMessageDto dto){
        service.markAsRead(dto);

        return buildResponse(Util.OKSUCCESS, Util.OKQUERY, null);
    }

    // 3) Marcar como leído
    @PostMapping("/answered")
    public ResponsesDto markAsAnswered(@RequestBody RequestMessageDto dto){
        service.markAsAnswered(dto);

        return buildResponse(Util.OKSUCCESS, Util.OKQUERY, null);
    }

    // 4) Borrado logico
    @DeleteMapping("/{id}")
    public ResponsesDto delete(@PathVariable String id){
        service.deleteLogical(id);

        return buildResponse(Util.OKSUCCESS, Util.REGDISABLE, null);
    }

    // 5) Todos
    @GetMapping
    public ResponsesDto getAll(){
        return buildResponse(Util.OKSUCCESS, Util.OKFOUND, service.getAll());
    }

    // 6) Leídos
    @GetMapping("/read")
    public ResponsesDto getRead(){
        return buildResponse(Util.OKSUCCESS, Util.OKFOUND, service.getRead());
    }

    // 7) Contestados
    @GetMapping("/answered")
    public ResponsesDto getAnswered(){
        return buildResponse(Util.OKSUCCESS, Util.OKFOUND, service.getAnswered());
    }
}