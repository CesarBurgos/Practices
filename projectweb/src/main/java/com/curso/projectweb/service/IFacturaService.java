package com.curso.projectweb.service;

import com.curso.projectweb.dto.FacturaRequestDto;
import com.curso.projectweb.dto.FacturaResponseDto;
import java.util.List;

public interface IFacturaService {
    List<FacturaResponseDto> getAll();
    List<FacturaResponseDto> getByCliente(String idCliente);

    FacturaResponseDto getById(String id);

    FacturaResponseDto create(FacturaRequestDto dto);

    FacturaResponseDto update(String id, FacturaRequestDto dto);
}
