package com.curso.projectweb.dto;

import lombok.Data;

@Data
public class AuthRequestDto {
    // Variable que almacenará el nombre de usuario
    // Se usa cuando el cliente envia las credenciales
    String email;

    // Variable que almacenará la contraseña
    // Se envia desde el frontend el backend para autenticacion
    String password;
}
