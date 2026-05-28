package com.curso.projectweb.model;

import java.util.Date;
import lombok.Data;

@Data
public class TelefonoModel {
    private String idTelefono;
    private String idCliente;
    private String telefono;
    private Integer estado;
    private Date fechaAlta;
}
