package com.curso.projectweb.dto;

import lombok.Data;



@Data
public class AuthResponseDto {
    // Token principal (normalmente JWT)
    // Se usa para autenticar cada petición al backend
    String toke;

    //Refresh token
    // Se usa para generar un nuevo token cuando el principal expira
    String refreshToken;

    Boolean success;
}
