package com.curso.projectweb.mapper;

import com.curso.projectweb.dto.FacturaRequestDto;
import com.curso.projectweb.dto.FacturaResponseDto;
import com.curso.projectweb.model.FacturaModel;
import org.springframework.stereotype.Component;

@Component
public class FacturaMapper {
    public FacturaModel toEntity(FacturaRequestDto dto){
        FacturaModel factura = new FacturaModel();

        factura.setIdCliente(dto.getIdCliente());
        factura.setMontoTotal(dto.getMontoTotal());
        factura.setFolio(dto.getFolio());
        factura.setAnio(dto.getAnio());
        factura.setIdEstadoFactura(dto.getIdEstadoFactura());

        return factura;
    }

    public FacturaResponseDto toResponse(FacturaModel factura){
        FacturaResponseDto dto = new FacturaResponseDto();

        dto.setIdFactura(factura.getIdFactura());
        dto.setIdCliente(factura.getIdCliente());
        dto.setMontoTotal(factura.getMontoTotal());
        dto.setFolio(factura.getFolio());
        dto.setAnio(factura.getAnio());
        dto.setIdEstadoFactura(factura.getIdEstadoFactura());
        dto.setFechaFactura(factura.getFechaFactura());

        return dto;
    }
}