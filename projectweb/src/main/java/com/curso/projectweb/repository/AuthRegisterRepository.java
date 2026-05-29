package com.curso.projectweb.repository;

import com.curso.projectweb.dto.PreRegisterRequestDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Repository
public class AuthRegisterRepository implements IAuthRegisterRepository{

    @Autowired
    private JdbcTemplate JDBCTemplate;

    @Override
    public void savePersona(PreRegisterRequestDto request) {
        String sql = """
                INSERT INTO PERSONA
                (
                    NOMBRE,
                    APATERNO,
                    AMATERNO,
                    TELEFONO,
                    CORREO,
                    UUID_CIUDAD,
                    UUID_ESTADO,
                    ESTADO,
                    VERIFICADO,
                    FECHA_ALTA
                )
                
                VALUES (?,?,?,?,?,?,?,0,99, SYSDATE)
                """;
        JDBCTemplate.update(
                sql,
                request.getNombre(),
                request.getApaterno(),
                request.getAmaterno(),
                request.getTelefono(),
                request.getCorreo(),
                request.getUuidCiudad(),
                request.getUuidEstado()
        );
    }

    @Override
    public void saveToken(String token, String idPersona){
        String sql = """
                INSERT INTO TOKEN_VERIFICACION
                (
                    ID_PERSONA,
                    TOKEN,
                    ID_TIPO_TOKEN,
                    USADO,
                    CADUCADO,
                    FECHA_ALTA,
                    FECHA_EXPIRACION,
                )
                VALUES (?, ?, 'CTK-000', 0, 0,
                    SYSTIMESTAMP, ?, 0
                )
                """;
        JDBCTemplate.update(
                sql,
                idPersona,
                token,
                Timestamp.valueOf(
                        LocalDateTime.now().plusHours(24)
                )
        );
    }

    @Override
    public String findByEmail(String email){
        String sql = "SELECT ID_PERSONA FROM PERSONAS WHERE CORREO = ?";
        try{
            // Cambiamos el Mapper por el tipo de dato que esperamos (String)
            return JDBCTemplate.queryForObject(sql, String.class, email);
        }catch (EmptyResultDataAccessException e){
            return "Usuario no encontrado";
        }
    }

    @Override
    public String findPersonaByValidToken(String token){
        String sql = """
                SELECT ID_PERSONA
                FROM TOKEN_VERIFICACION
                WHERE TOKEN = ?
                    AND USADO = 0
                    AND CADUCADO = 0
                    AND FECHA_EXPIRACION > SYSTIMESTAMP
                    AND ESTADO = 0
                """;

        try{
            return JDBCTemplate.queryForObject(sql, String.class, token);
        }catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    @Override
    public void createdUser(String idPersona, String passwordHash){
        String sql = """
                INSERT INTO USUARIOS
                (
                    ID_PERSONA,
                    PASSWORD,
                    ID_ROL,
                    ESTADO,
                    FECHA_ALTA
                )
                VALUES (?, ?, ?, 0, SYSDATE)
                """;

        JDBCTemplate.update(sql, idPersona, passwordHash, "RL-001" // default User
        );
    }

    @Override
    public void verifyPersona(String idPersona){
        String sql = """
                    UPDATE PERSONAS
                    SET
                        VERIFICADO = 0
                    WHERE
                        ID_PERSONA = ?
                """;

        JDBCTemplate.update(sql, idPersona);
    }

    @Override
    public void markTokenAsUsed(String token){
        String sql = """
                UPDATE TOKEN_VERIFICACION
                SET
                    USADO = 1,
                    FECHA_USO = SYSTIMESTAMP
                WHERE
                    TOKEN = ?
                """;

        JDBCTemplate.update(sql, token);
    }
}