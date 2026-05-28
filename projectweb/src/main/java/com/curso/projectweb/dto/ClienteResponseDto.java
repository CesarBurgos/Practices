package com.curso.projectweb.dto;

import lombok.Data;
import java.util.Date;

@Data
public class ClienteResponseDto {
    private String idCliente;
    private String nombreCompleto;
    private String email;
    private Date fechaAlta;
    private Integer estado;
}
