package com.curso.projectweb.mapper;

import com.curso.projectweb.dto.TelefonoRequestDto;
import com.curso.projectweb.dto.TelefonoResponseDto;
import com.curso.projectweb.model.TelefonoModel;
import org.springframework.stereotype.Component;

@Component
public class TelefonoMapper {
    public TelefonoModel toEntity(TelefonoRequestDto dto){
        TelefonoModel telefono = new TelefonoModel();

        telefono.setIdCliente(dto.getIdCliente());
        telefono.setTelefono(dto.getTelefono());

        return telefono;
    }

    public TelefonoResponseDto toRespose(TelefonoModel telefono){
        TelefonoResponseDto dto = new TelefonoResponseDto();

        dto.setIdTelefono(telefono.getIdTelefono());
        dto.setIdCliente(telefono.getIdCliente());
        dto.setTelefono(telefono.getTelefono());
        dto.setEstado(telefono.getEstado());
        dto.setFechaAlta(telefono.getFechaAlta());

        return dto;
    }
}
