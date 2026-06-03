package com.curso.projectweb.service;

import com.curso.projectweb.model.UsuarioListado;
import com.curso.projectweb.repository.UsuarioAdminRepository;
import com.curso.projectweb.util.MailTemplateUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioAdminService implements IUsuarioAdminService{
    private final UsuarioAdminRepository repository;
    private final MailService emailService;

    @Override
    public void banearUsuario(String userId){
        repository.actualizarEstado(userId, 99);

        String correo = repository.obtenerCorreoUsuario(userId);
        String nombre = repository.obtenerNombreUsuario(userId);
        String html = MailTemplateUtil.cuentaInactivadaTemplate(nombre);

        emailService.enviarHTML(correo, "Cuenta inactivada", html);
    }

    @Override
    public void activarUsuario(String userId){
        repository.actualizarEstado(userId, 0);

        String correo = repository.obtenerCorreoUsuario(userId);
        String nombre = repository.obtenerNombreUsuario(userId);
        String html = MailTemplateUtil.cuentaActivadaTemplate(nombre);

        emailService.enviarHTML(correo, "Cuenta reactivada", html);
    }

    @Override
    public List<UsuarioListado> obtenerUsuarios(){
        return repository.obtenerUsuarios();
    }
}
