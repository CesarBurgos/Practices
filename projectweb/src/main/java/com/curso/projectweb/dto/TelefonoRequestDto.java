package com.curso.projectweb.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class TelefonoRequestDto {
    @NotBlank(message = "El idCliente es obligstorio")
    private String idCliente;

    @NotBlank(message = "El teléfono es obligatorio")
    @Size(min=10, max=15, message = "El teléfono debe tener entre 10 y 15 caracteres")
    @Pattern(
            regexp = "^[0-9]+$",
            message = "El telefono solo debe contener números"
    )
    private String telefono;
}
