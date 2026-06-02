package com.curso.projectweb.service;

import com.curso.projectweb.dto.PagoRequestDto;
import com.curso.projectweb.dto.PagoResponseDto;
import com.curso.projectweb.exception.BusinessException;
import com.curso.projectweb.exception.ResourceNotFoundException;
import com.curso.projectweb.mapper.PagoMapper;
import com.curso.projectweb.model.PagoModel;
import com.curso.projectweb.repository.IPagoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class PagoService implements IPagoService{
    private final IPagoRepository repository;
    private final PagoMapper mapper;

    @Override
    public List<PagoResponseDto> getAll(){
        log.info("Consultando pagos");

        return repository.findAll()
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public List<PagoResponseDto> getByFactura(String idFactura){
        log.info("Consultando pagos de factura {}", idFactura);

        return repository.findByFactura(idFactura)
                .stream()
                .map(mapper::toResponse)
                .toList();
    }

    @Override
    public PagoResponseDto getById(String id){
        log.info("Consultando pago {}", id);

        PagoModel pago = repository.findById(id)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Pago no encontrado"));

        return mapper.toResponse(pago);
    }

    @Override
    @Transactional
    public PagoResponseDto create(PagoRequestDto dto){
        log.info("Creando pago factura {}", dto.getIdFactura());

        if(!repository.existsFactura(dto.getIdFactura())){
            throw new BusinessException("La factura no existe");
        }

        if(!repository.existsEstadoPago(dto.getIdEstadoPago())){
            throw new BusinessException("El estado de pago no existe");
        }

        PagoModel pago = mapper.toEntity(dto);
        PagoModel saved = repository.save(pago);

        return mapper.toResponse(saved);
    }

    @Override
    @Transactional
    public PagoResponseDto update(String id, PagoRequestDto dto){
        log.info("Actualizando pago {}", id);

        getById(id);
        PagoModel pago = mapper.toEntity(dto);
        PagoModel updated = repository.update(id, pago);

        return mapper.toResponse(updated);
    }
}
