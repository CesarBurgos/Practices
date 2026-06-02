package com.curso.projectweb.service;

import com.curso.projectweb.model.CatalogoModel;
import java.util.List;

public interface ICatalogoService {
    List<CatalogoModel> obtenerCatalogo(String tipo);
    List<CatalogoModel> ontenerCiudadesPorEstado(String uuidEstado);
}
