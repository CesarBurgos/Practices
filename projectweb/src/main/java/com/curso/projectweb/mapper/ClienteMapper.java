package com.curso.projectweb.mapper;

import com.curso.projectweb.dto.ClienteRequestDto;
import com.curso.projectweb.dto.ClienteResponseDto;
import com.curso.projectweb.model.ClienteModel;
import org.springframework.stereotype.Component;

@Component
public class ClienteMapper {
    public ClienteModel toEntity(ClienteRequestDto dto){
        ClienteModel c = new ClienteModel();

        c.setNombre(dto.getNombre());
        c.setAPaterno(dto.getAPaterno());
        c.setAMaterno(dto.getAMaterno());
        c.setEmail(dto.getEmail());

        return c;
    }

    public ClienteResponseDto toResponse(ClienteModel c){
        ClienteResponseDto dto = new ClienteResponseDto();

        dto.setIdCliente(c.getIdCliente());
        dto.setNombreCompleto(
                c.getNombre() + " "  +
                c.getAPaterno() + " " +
                (c.getAMaterno() != null ? c.getAMaterno() : "")
        );
        dto.setEmail(c.getEmail());
        dto.setFechaAlta(c.getFechaAlta());
        dto.setEstado(c.getEstado());

        return dto;
    }
}
