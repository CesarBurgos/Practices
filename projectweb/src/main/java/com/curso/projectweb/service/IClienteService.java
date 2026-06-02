package com.curso.projectweb.service;

import com.curso.projectweb.dto.ClienteRequestDto;
import com.curso.projectweb.dto.ClienteResponseDto;
import java.util.List;

public interface IClienteService {
    List<ClienteResponseDto> getAll();
    ClienteResponseDto getById(String id);
    ClienteResponseDto create(ClienteRequestDto dto);
    ClienteResponseDto update(String id, ClienteRequestDto dto);
    void delete(String id);
}
