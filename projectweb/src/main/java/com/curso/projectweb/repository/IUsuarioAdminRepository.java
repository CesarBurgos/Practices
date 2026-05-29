package com.curso.projectweb.repository;

import com.curso.projectweb.model.UsuarioListado;

import java.util.List;

public interface IUsuarioAdminRepository {

    Integer actualizarEstado(String userId, Integer estado);

    String obtenerCorreoUsuario(String userId);

    String obtenerNombreUsuario(String userId);

    List<UsuarioListado> obtenerUsuarios();
}
