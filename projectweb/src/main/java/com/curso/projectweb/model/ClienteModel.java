package com.curso.projectweb.model;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class ClienteModel {
    private String idCliente;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String email;
    private Date fechaAlta;
    private Integer estado;
}
