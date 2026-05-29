package com.curso.projectweb.repository;

import com.curso.projectweb.model.CatalogoModel;
import java.util.List;

public interface ICatalogoRepository {
    List<CatalogoModel> obtenerCatalogo(
            String tabla,
            String columnaId,
            String columnaDescription
    );

    List<CatalogoModel> obtenerCiudadesPorEstado(String UUIDEstado);
}