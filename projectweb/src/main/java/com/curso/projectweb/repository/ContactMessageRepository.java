package com.curso.projectweb.repository;

import com.curso.projectweb.model.ContactMessageModel;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ContactMessageRepository implements IContactMessageRepository{
    private final JdbcTemplate JDBCTemplate;

    @Override
    public int save(ContactMessageModel message){
        String sql = """
                INSERT INTO MENSAJE_CONTACTO
                    (NOMBRE, CORREO, DESCRIPTION)
                VALUES
                    (?,?,?)
                """;

        return JDBCTemplate.update(sql,
                message.getName(),
                message.getEmail(),
                message.getDescription());
    }

    @Override
    public int updateStatus(String messageID, String status, String userResponse){
        String sql = """
                UPDATE MENSAJE_CONTACTO
                SET
                    ID_STATUS_MENSAJE = ?,
                    USUARIO_RESPUESTA = ?
                WHERE
                    ID_MENSAJE = ?
                    AND ACTIVO = 1
                """;

        return JDBCTemplate.update(sql,
                status,
                userResponse,
                messageID);
    }

    @Override
    public int logicalDelete(String messageID){
        String sql = """
                UPDATE MENSAJE_CONTACTO
                SET
                    ACTIVO = 0
                WHERE
                    ID_MENSAJE = ?
                """;

        return JDBCTemplate.update(sql, messageID);
    }

    @Override
    public List<ContactMessageModel> findAll(){
        String sql = """
                SELECT
                    ID_MENSAJE AS messageId,
                    NOMBRE AS name,
                    DESCRIPTION AS description,
                    ACTIVO AS active,
                    FECHA_ENVIO AS dateSend,
                    ID_STATUS_MENSAJE AS statusMessage,
                    USUARIO_RESPUESTA AS userResponse
                FROM
                    MENSAJE_CONTACTO
                WHERE
                    ACTIVO = 1
                ORDER BY
                    FECHA_ENVIO DESC
                """;
        return JDBCTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(ContactMessageModel.class)
        );
    }

    @Override
    public List<ContactMessageModel> findByStatus(String status){
        String sql = """
                SELECT
                    ID_MENSAJE AS messageId,
                    NOMBRE AS name,
                    CORREO AS email,
                    DESCRIPTION AS description,
                    ACTIVO AS active,
                    FECHA_ENVIO AS dateSend,
                    USUARIO_RESPUESTA AS userResponse
                FROM
                    MENSAJE_CONTACTO
                WHERE
                    ID_STATUS_MENSAJE = ?
                """;
        return JDBCTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(ContactMessageModel.class),
                status
        );
    }

    @Override
    public ContactMessageModel findById(String messageID){
        String sql = """
                SELECT
                    ID_MENSAJE AS messageId,
                    NOMBRE AS name,
                    CORREO AS email,
                    DESCRIPTION AS description,
                    ACTIVO AS active,
                    FECHA_ENVIO AS dateSend,
                    USUARIO_RESPUESTA AS userResponse
                FROM
                    MENSAJE_CONTACTO
                WHERE
                    ID_MENSAJE = ?
                """;
        return JDBCTemplate.queryForObject(
                sql,
                new BeanPropertyRowMapper<>(ContactMessageModel.class),
                messageID
        );
    }


}
