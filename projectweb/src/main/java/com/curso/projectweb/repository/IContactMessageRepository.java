package com.curso.projectweb.repository;

import com.curso.projectweb.model.ContactMessageModel;
import java.util.List;

public interface IContactMessageRepository {
    public int save(ContactMessageModel message);

    public int updateStatus(String messageId, String status, String userResponse);

    public int logicalDelete(String messageId);

    public List<ContactMessageModel> findAll();

    public List<ContactMessageModel> findByStatus(String status);

    public ContactMessageModel findById(String messageId);
}
