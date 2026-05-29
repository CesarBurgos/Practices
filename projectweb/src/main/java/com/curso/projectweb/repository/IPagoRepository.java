package com.curso.projectweb.repository;

import com.curso.projectweb.model.PagoModel;

import java.util.List;
import java.util.Optional;

public interface IPagoRepository {
    List<PagoModel> findAll();

    List<PagoModel> findByFactura(String idFactura);

    Optional<PagoModel> findById(String id);

    PagoModel save(PagoModel pago);

    PagoModel update(String id, PagoModel pago);

    boolean existsFactura(String idFactura);

    boolean existsEstadoPago(String idEstadoPago);
}
