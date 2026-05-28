package com.curso.projectweb.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class DatosFiscalesRequestDto {
    @NotBlank(message = "El idCliente es obligatorio")
    private String idCliente;

    @NotBlank(message = "La razón social es obligatoria")
    @Size(max = 150, message = "Máximo de 150 caracteres")
    private String razonSocial;

    @NotBlank(message = "El RFC es obligatorio")
    @Pattern(
            regexp = "^([A-ZÑ&]{3,4})\\d{6}([A-Z\\d]{3})$",
            message = "RFC inválido"
    )
    private String RFC;

    @NotBlank(message = "El código Postal es obligatorio")
    @Pattern(
            regexp = "^[0-9]{5}$",
            message = "Código Postal invalido"
    )
    private String codigoPostal;

    @NotBlank(message = "El idTipoCliente es obligatorio")
    @Size(max = 3)
    private String idTipoCliente;

    @NotBlank(message = "El uso CFDI es obligatorio")
    @Size(max = 3)
    private String usoCFDI;

    @Email(message = "Email invalido")
    @Size(max = 100)
    private String email;

    @NotBlank(message = "El estado es obligatorio")
    private String dEstado;

    @NotBlank(message = "La Ciudad es obligatoria")
    private String dCiudad;

    @NotBlank(message = "La Colonia es obligatoria")
    private String dColonia;

    @NotBlank(message = "La Zona es obligatoria")
    private String dZona;
}