package com.curso.projectweb.dto;

import com.curso.projectweb.model.ContactMessageModel;
import lombok.Data;

@Data
public class RequestMessageDto {
    private String action; // ADD, READ, ANSWER, DELETE
    private ContactMessageModel data;
}
