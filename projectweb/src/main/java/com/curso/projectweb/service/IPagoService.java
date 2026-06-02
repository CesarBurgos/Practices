package com.curso.projectweb.service;

import com.curso.projectweb.dto.PagoRequestDto;
import com.curso.projectweb.dto.PagoResponseDto;

import java.util.List;

public interface IPagoService {
    List<PagoResponseDto> getAll();

    List<PagoResponseDto> getByFactura(String idFactura);

    PagoResponseDto getById(String id);

    PagoResponseDto create(PagoRequestDto dto);

    PagoResponseDto update(String id, PagoRequestDto dto);
}
