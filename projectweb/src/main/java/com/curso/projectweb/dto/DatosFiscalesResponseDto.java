package com.curso.projectweb.dto;

import lombok.Data;
import java.util.Date;

@Data
public class DatosFiscalesResponseDto {
    private String idDatosfic;
    private String idCliente;
    private String razonSocial;
    private String RFC;
    private String codigoPostal;
    private String idTipoCliente;
    private String usoCFDI;
    private String email;
    private String dEstado;
    private String dCiudad;
    private String dColonia;
    private String dZona;
    private Date createdAt;
    private Integer status;
}
