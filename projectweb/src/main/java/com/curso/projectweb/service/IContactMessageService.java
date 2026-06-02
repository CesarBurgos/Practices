package com.curso.projectweb.service;

import com.curso.projectweb.dto.RequestMessageDto;
import com.curso.projectweb.model.ContactMessageModel;

import java.util.List;

public interface IContactMessageService {
    void create(RequestMessageDto dto);

    void markAsRead(RequestMessageDto dto);

    void markAsAnswered(RequestMessageDto dto);

    void deleteLogical(String messageId);

    List<ContactMessageModel> getAll();

    List<ContactMessageModel> getRead();

    List<ContactMessageModel> getAnswered();
}
