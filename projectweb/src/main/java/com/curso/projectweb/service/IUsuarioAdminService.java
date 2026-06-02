package com.curso.projectweb.service;

import com.curso.projectweb.model.UsuarioListado;
import java.util.List;

public interface IUsuarioAdminService {
    void banearUsuario(String userId);
    void activarUsuario(String userId);
    List<UsuarioListado> obtenerUsuarios();
}
