package com.curso.projectweb.repository;

import com.curso.projectweb.model.userModel;

// Definimos una interfaz
// En Java, una interfaz solo declara métodos (no implmentaciones)
public interface IUserRepository {

    // Método que buscará un usuario por su nombre
    // Recibe como parámetro el username
    // Devuelve un objeto UserModel si lo encuentra
    userModel findByEmail(String correo);
}
