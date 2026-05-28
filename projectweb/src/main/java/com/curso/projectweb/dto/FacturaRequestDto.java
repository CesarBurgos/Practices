package com.curso.projectweb.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Max;

import java.math.BigDecimal;

public class FacturaRequestDto {
    @NotBlank(message = "El idCliente es obligatorio")
    private String idCliente;

    @NotNull(message = "El montoTotal es obligatorio")
    @DecimalMin(value = "0.01", message = "El monto debe ser Mayor a Cero")
    private BigDecimal montoTotal;

    @NotNull(message = "El Folio es obligatorio")
    @Positive(message = "El folio debe ser Mayor a Cero")
    private Integer folio;

    @NotNull(message = "El año es obligatorio")
    @Min(value = 2000, message = "El año no es válido")
    @Max(value = 2099, message = "El año no es válido")
    private Integer anio;

    @NotBlank(message = "El idEstadoFactura es obligatorio")
    @Size(max = 15, message = "Máximo 15 caracteres")
    private String idEstadoFactura;
}
