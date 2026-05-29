package com.curso.projectweb.repository;

import com.curso.projectweb.model.ClienteModel;
import java.util.List;
import java.util.Optional;

public interface IClienteRepository {
    List<ClienteModel> findALL();

    Optional<ClienteModel> findById(String id);

    ClienteModel save(ClienteModel cliente);

    ClienteModel update(String id, ClienteModel cliente);

    void deleteLogical(String id);
}
