package com.curso.projectweb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @Data es una anotación de Lombok
 * Genera automaticamente:
 * - Getters
 * - Setters
 * - toString()
 * - equals()
 * - hashCode()
 * */

@Data
public class userModel {
    // Identificador unico del usuario
    // Normalmente corresponde a la allave primaria en la base de datos
    private String userId;
    private String idPersona;
    private String nombre;
    private String correo;
    private String password;
    private String telefono;
    private String idRol;
    private String nombreRol;

}
