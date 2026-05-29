package com.curso.projectweb.repository;

import com.curso.projectweb.model.DatosFiscalesModel;

import java.util.List;
import java.util.Optional;

public interface IDatosFiscalesRepository {
    List<DatosFiscalesModel> findAll();

    Optional<DatosFiscalesModel> findById(String id);

    Optional<DatosFiscalesModel> findByRFC(String RFC);

    DatosFiscalesModel save(DatosFiscalesModel datos);

    DatosFiscalesModel update(String id, DatosFiscalesModel datos);

    void deleteLogical(String id);

    boolean existsCliente(String idCliente);

    boolean existsTipoCliente(String idTipoCliente);
}
