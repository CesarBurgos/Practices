package com.curso.projectweb.service;

import com.curso.projectweb.dto.TelefonoRequestDto;
import com.curso.projectweb.dto.TelefonoResponseDto;

import java.util.List;

public interface ITelefonoService {
    List<TelefonoResponseDto> getAll();

    List<TelefonoResponseDto> getByCliente(String idCliente);
    TelefonoResponseDto getById(String id);
    TelefonoResponseDto create(TelefonoRequestDto dto);
    TelefonoResponseDto update(String id, TelefonoRequestDto dto);
    void delete(String id);
}
