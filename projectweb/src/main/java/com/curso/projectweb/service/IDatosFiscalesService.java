package com.curso.projectweb.service;

import com.curso.projectweb.dto.DatosFiscalesRequestDto;
import com.curso.projectweb.dto.DatosFiscalesResponseDto;

import java.util.List;

public interface IDatosFiscalesService {
    List<DatosFiscalesResponseDto> getAll();

    DatosFiscalesResponseDto getById(String id);

    DatosFiscalesResponseDto create(DatosFiscalesRequestDto dto);

    DatosFiscalesResponseDto update(String id, DatosFiscalesRequestDto dto);

    void delete(String id);
}
