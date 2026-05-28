package com.curso.projectweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioListado {
    private String useId;
    private String nombreCompleto;
    private String correo;
    private String rol;
    private Integer estado;
    private Date fechaAlta;
}
