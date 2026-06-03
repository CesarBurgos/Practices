package com.curso.projectweb.service;

// ley de proteccion de datos personales en posesión de terceros


import com.curso.projectweb.dto.ActivateAccountDto;
import com.curso.projectweb.repository.AuthRegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

public class ActivateAccountService {
    @Autowired
    private AuthRegisterRepository repository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void activateAccount(ActivateAccountDto request){
        if(!request.getPassword().equals(request.getConfirmPassword())){
            throw  new RuntimeException("Las contraseñas no coinciden");
        }

        String idPersona = repository.findPersonaByValidToken(request.getToken());

        if(idPersona == null){
            throw new RuntimeException("Token invalido o expirado");
        }

        String hash = passwordEncoder.encode(request.getPassword());

        repository.createdUser(idPersona, hash);

        repository.verifyPersona(idPersona);

        repository.markTokenAsUsed(request.getToken());
    }
}
