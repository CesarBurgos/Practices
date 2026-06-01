package com.curso.projectweb.repository;

import com.curso.projectweb.model.DatosFiscalesModel;

import java.util.List;
import java.util.Optional;

public interface IDatosFiscalesRepository {
    public List<DatosFiscalesModel> findAll();

    public Optional<DatosFiscalesModel> findById(String id);

    public Optional<DatosFiscalesModel> findByRFC(String RFC);

    public DatosFiscalesModel save(DatosFiscalesModel datos);

    public DatosFiscalesModel update(String id, DatosFiscalesModel datos);

    public void deleteLogical(String id);

    public boolean existsCliente(String idCliente);

    public boolean existsTipoCliente(String idTipoCliente);
}
