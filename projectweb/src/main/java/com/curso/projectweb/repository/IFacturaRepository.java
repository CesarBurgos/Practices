package com.curso.projectweb.repository;

import com.curso.projectweb.model.FacturaModel;

import java.util.List;
import java.util.Optional;

public interface IFacturaRepository {
    List<FacturaModel> findAll();

    List<FacturaModel> findByCliente(String idCliente);

    Optional<FacturaModel> findById(String id);

    FacturaModel save(FacturaModel factura);

    FacturaModel update(String id, FacturaModel factura);

    boolean existsCliente(String idCliente);

    boolean existsEstadoFactura(String idEstadoFactura);
}
