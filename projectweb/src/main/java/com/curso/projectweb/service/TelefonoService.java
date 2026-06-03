package com.curso.projectweb.service;

import com.curso.projectweb.dto.TelefonoRequestDto;
import com.curso.projectweb.dto.TelefonoResponseDto;
import com.curso.projectweb.exception.BusinessException;
import com.curso.projectweb.exception.ResourceNotFoundException;
import com.curso.projectweb.mapper.TelefonoMapper;
import com.curso.projectweb.model.TelefonoModel;
import com.curso.projectweb.repository.ITelefonoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class TelefonoService implements ITelefonoService{
    private final ITelefonoRepository repository;
    private final TelefonoMapper mapper;

    @Override
    public List<TelefonoResponseDto> getAll(){
        log.info("Consultando telefonos");

        return repository.findAll()
                .stream()
                .map(mapper::toRespose)
                .toList();
    }

    @Override
    public List<TelefonoResponseDto> getByCliente(String idCliente){
        log.info("Consultando telefonos del cliente {}", idCliente);

        return repository.findByCliente(idCliente)
                .stream()
                .map(mapper::toRespose)
                .toList();
    }

    @Override
    public TelefonoResponseDto getById(String id){
        log.info("Consultando teléfono {}", id);

        TelefonoModel telefono = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Telefono no encontrado"));

        return mapper.toRespose(telefono);
    }

    @Override
    @Transactional
    public TelefonoResponseDto create(TelefonoRequestDto dto){
        log.info("Creando teléfono para cliente {}", dto.getIdCliente());

        if(!repository.existsCliente(dto.getIdCliente())){
            throw new BusinessException("El cliente no existe");
        }

        TelefonoModel telefono = mapper.toEntity(dto);
        telefono.setEstado(1);

        TelefonoModel saved = repository.save(telefono);

        return mapper.toRespose(saved);
    }

    @Override
    @Transactional
    public TelefonoResponseDto update(String id, TelefonoRequestDto dto){
        log.info("Actualizando télefono {}", id);

        getById(id);
        TelefonoModel telefono = mapper.toEntity(dto);
        telefono.setEstado(1);
        TelefonoModel update = repository.update(id, telefono);

        return mapper.toRespose(update);
    }

    @Override
    @Transactional
    public void delete(String id){
        log.info("Eliminando telefono {}", id);

        getById(id);

        repository.deleteLogical(id);
    }
}
