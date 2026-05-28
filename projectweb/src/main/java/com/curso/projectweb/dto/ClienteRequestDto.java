package com.curso.projectweb.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class ClienteRequestDto {
    @NotBlank(message = "El Nombre es obligatorio")
    @Size(max = 40)
    private String nombre;

    @NotBlank(message = "El Apellido Paterno es obligatorio")
    @Size(max = 40)
    private String aPaterno;

    @Size(max = 40)
    private String aMaterno;

    @Email(message = "Formato de email inválido")
    @Size(max = 100)
    private String email;
}
