package com.curso.projectweb.model;

import lombok.Data;

public class CatalogoModel {
    private String id;
    private String description;

    public CatalogoModel(String id, String description){
        this.id = id;
        this.description = description;
    }
}
