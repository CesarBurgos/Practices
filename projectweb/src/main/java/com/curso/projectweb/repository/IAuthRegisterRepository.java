package com.curso.projectweb.repository;

import com.curso.projectweb.dto.PreRegisterRequestDto;

public interface IAuthRegisterRepository {
    public void savePersona(PreRegisterRequestDto request);
    public void saveToken(String token, String idPersona);

    public String findByEmail(String email);
    public String findPersonaByValidToken(String token);
    public void createdUser(String idPersona, String passwordHash);
    public void verifyPersona(String idPersona);
    public void markTokenAsUsed(String token);
}
