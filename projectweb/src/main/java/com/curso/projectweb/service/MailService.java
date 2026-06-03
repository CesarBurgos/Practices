package com.curso.projectweb.service;

import com.curso.projectweb.util.MailTemplateUtil;
import jakarta.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
    @Autowired
    private JavaMailSender mailSender;

    public void sendVerificationEmail(String correo, String token){
        try{
            String link = "http://app.curso/verify?token=" + token;

            String html = MailTemplateUtil.buildVerificationTemplate(link);

            MimeMessage message = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(
                    message,
                    true,
                    "UTF-8"
            );

            helper.setTo(correo);
            helper.setSubject("Verifica tu cuenta | CURSO");
            helper.setText(html, true);

            mailSender.send(message);
        }catch(Exception e){
            throw new RuntimeException(
                    "Error al enviar el correo: " + e.getMessage()
            );
        }
    }

    public void sendContactConfirmation(String correo, String nombre){
        try{
            String html = MailTemplateUtil.buildContactTemplate(nombre);

            MimeMessage message = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");

            helper.setTo(correo);
            helper.setSubject("Mensaje recibido | CURSO");
            helper.setText(html, true);

            mailSender.send(message);
        }catch(Exception e){
            throw new RuntimeException("Error al enviar correo");
        }
    }

    public void sendContactReplyEmail(String correo, String nombre, String respuesta){
        try{
            String html = MailTemplateUtil.buildReplyTemplate(nombre, respuesta);

            MimeMessage message = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
            helper.setTo(correo);
            helper.setSubject("Respuesta a tu mensaje | CURSO");
            helper.setText(html, true);

            mailSender.send(message);
        }catch(Exception e){
            throw new RuntimeException("Error al enviar respuesta");
        }
    }

    public void enviarHTML(String correo, String asunto, String html){
        try{
            MimeMessage message = mailSender.createMimeMessage();

            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(correo);
            helper.setSubject(asunto);
            helper.setText(html, true);

            mailSender.send(message);
        }catch(Exception e){
            throw new RuntimeException("Error al enviar correo: " + e.getMessage());
        }
    }
}