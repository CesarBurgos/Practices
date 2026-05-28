package com.curso.projectweb.model;

import java.sql.Timestamp;

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
