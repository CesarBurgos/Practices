package com.curso.projectweb.mapper;

import com.curso.projectweb.dto.PagoRequestDto;
import com.curso.projectweb.dto.PagoResponseDto;
import com.curso.projectweb.model.PagoModel;
import org.springframework.stereotype.Component;

@Component
public class PagoMapper {
    public PagoModel toEntity(PagoRequestDto dto){
        PagoModel pago = new PagoModel();

        pago.setIdFactura(dto.getIdFactura());
        pago.setMonto(dto.getMonto());
        pago.setIdEstadoPago(dto.getIdEstadoPago());

        return pago;
    }

    public PagoResponseDto toResponse(PagoModel pago){
        PagoResponseDto dto = new PagoResponseDto();

        dto.setIdPago(pago.getIdPago());
        dto.setIdFactura(pago.getIdFactura());
        dto.setMonto(pago.getMonto());
        dto.setIdEstadoPago(pago.getIdEstadoPago());
        dto.setFechaPago(pago.getFechaPago());

        return dto;
    }
}
