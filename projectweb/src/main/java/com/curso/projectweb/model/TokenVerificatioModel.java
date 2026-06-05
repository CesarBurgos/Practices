package com.curso.projectweb.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class TokenVerificatioModel {
    private String idTokenVerificacion;
    private String idPersona;
    private String token;
    private String idTipoToken;
    private Integer usado;
    private Integer caducado;
    private Timestamp fechaAlta;
    private Timestamp fechaExpiracion ;
}
