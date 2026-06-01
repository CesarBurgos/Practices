package com.curso.projectweb.repository;

import com.curso.projectweb.model.TelefonoModel;
import com.curso.projectweb.repository.impl.TelefonoRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class TelefonoRepository implements ITelefonoRepository{
    private final JdbcTemplate JDBCTemplate;
    private final TelefonoRowMapper MAPPER = new TelefonoRowMapper();


    @Override
    public List<TelefonoModel> findAll(){
        String sql = """
                SELECT
                    ID_TELEFONO,
                    ID_CLIENTE,
                    TELEFONO,
                    ESTADO
                    FECHA_ALTA
                FROM
                    TELEFONOS
                WHERE
                    ESTADO = 1
                """;

        return JDBCTemplate.query(sql, MAPPER);
    }

    @Override
    public List<TelefonoModel> findByCliente(String idCliente){
        String sql = """
                SELECT
                    ID_TELEFONO,
                    ID_CLIENTE,
                    TELEFONO,
                    ESTADO,
                    FECHA_ALTA
                FROM
                    TELEFONOS
                WHERE
                    ID_CLIENTE = ?
                    AND ESTADO = 1
                """;
        return JDBCTemplate.query(sql, MAPPER, idCliente);
    }

    @Override
    public Optional<TelefonoModel> findById(String ID){
        String sql = """
                SELECT
                    ID_TELEFONO,
                    ID_CLIENTE,
                    TELEFONO,
                    ESTADO,
                    FECHA_ALTA
                FROM
                    TELEFONOS
                WHERE
                    ID_TELEFONO = ?
                """;

        return JDBCTemplate.query(sql, MAPPER, ID).stream().findFirst();
    }

    @Override
    public TelefonoModel save(TelefonoModel telefono){
        String sql = """
                INSERT INTO TELEFONOS
                    (
                        ID_CLIENTE,
                        TELEFONO,
                        ESTADO
                    )
                VALUES
                    (?,?,?)
                """;
        JDBCTemplate.update(sql,
                telefono.getIdCliente(),
                telefono.getTelefono(),
                telefono.getEstado());

        return telefono;
    }

    @Override
    public TelefonoModel update(String id, TelefonoModel telefono){
        String sql = """
                UPDATE
                    TELEFONOS
                SET
                    TELEFONO = ?,
                    ESTADO = ?
                WHERE ID_TELEFONO = ?
                """;

        JDBCTemplate.update(sql,
                telefono.getTelefono(),
                telefono.getEstado(),
                id);

        return telefono;
    }

    @Override
    public void deleteLogical(String id){
        String sql = """
                UPDATE
                    TELEFONOS
                SET
                    ESTADO = 0
                WHERE ID_TELEFONO = ?
                """;

        JDBCTemplate.update(sql, id);
    }

    @Override
    public boolean existsCliente(String idCliente){
        String sql = """
                SELECT
                    COUNT(1)
                FROM
                    CLIENTES
                WHERE ID_CLIENTE = ?
                    AND ESTADO = 1
                """;

        Integer count = JDBCTemplate.queryForObject(sql, Integer.class, idCliente);

        return count != null && count > 0;
    }
}