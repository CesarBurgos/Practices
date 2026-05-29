package com.curso.projectweb.mapper;

import com.curso.projectweb.dto.DatosFiscalesRequestDto;
import com.curso.projectweb.dto.DatosFiscalesResponseDto;
import com.curso.projectweb.model.DatosFiscalesModel;
import org.springframework.stereotype.Component;

@Component
public class DatosFiscalesMapper {
    public DatosFiscalesModel toEntity(DatosFiscalesRequestDto dto){
        DatosFiscalesModel datos = new DatosFiscalesModel();

        datos.setIdCliente(dto.getIdCliente());
        datos.setRazonSocial(dto.getRazonSocial());
        datos.setRfc(dto.getRFC());
        datos.setCodigoPostal(dto.getCodigoPostal());
        datos.setIdTipoCliente(dto.getIdTipoCliente());
        datos.setUsoCFDI(dto.getUsoCFDI());
        datos.setEmail(dto.getEmail());
        datos.setDEstado(dto.getDEstado());
        datos.setDCiudad(dto.getDCiudad());
        datos.setDColonia(dto.getDColonia());
        datos.setDZona(dto.getDZona());

        return datos;
    }

    public DatosFiscalesResponseDto toResponse(DatosFiscalesModel datos){
        DatosFiscalesResponseDto dto = new DatosFiscalesResponseDto();

        dto.setIdDatosfic(datos.getIdDatosfic());
        dto.setIdCliente(datos.getIdCliente());
        dto.setRazonSocial(datos.getRazonSocial());
        dto.setRFC(datos.getRfc());
        dto.setCodigoPostal(datos.getCodigoPostal());
        dto.setIdTipoCliente(datos.getIdTipoCliente());
        dto.setUsoCFDI(datos.getUsoCFDI());
        dto.setEmail(datos.getEmail());
        dto.setDEstado(datos.getDEstado());
        dto.setDCiudad(datos.getDCiudad());
        dto.setDColonia(datos.getDColonia());
        dto.setDZona(datos.getDZona());
        dto.setCreatedAt(datos.getCreatedAt());
        dto.setStatus(datos.getStatus());

        return dto;
    }
}