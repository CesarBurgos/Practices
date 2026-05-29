package com.curso.projectweb.repository;

import com.curso.projectweb.model.TelefonoModel;

import java.util.List;
import java.util.Optional;

public interface ITelefonoRepository {
    List<TelefonoModel> findAll();

    List<TelefonoModel> findByCliente(String idCliente);

    Optional<TelefonoModel> findById(String id);

    TelefonoModel save(TelefonoModel telefono);

    TelefonoModel update(String id, TelefonoModel telefono);

    void deleteLogical(String id);

    boolean existsCliente(String idCliente);
}