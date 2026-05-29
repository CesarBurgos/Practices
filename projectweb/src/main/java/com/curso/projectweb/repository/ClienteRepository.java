package com.curso.projectweb.repository;

import com.curso.projectweb.model.ClienteModel;
import com.curso.projectweb.repository.impl.ClienteRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Repository
public class ClienteRepository implements IClienteRepository{

    private final JdbcTemplate JDBCTemplate;
    private final ClienteRowMapper MAPPER = new ClienteRowMapper();

    @Override
    public List<ClienteModel> findALL(){
        String sql = """
                SELECT 
                    ID_CLIENTE,
                    NOMBRE,
                    APATERNO,
                    AMATERNO,
                    EMAIL,
                    FECHA_ALTA,
                    ESTADO
                FROM
                    CLIENTES
                WHERE
                    ESTADO = 1
                """;

        return JDBCTemplate.query(sql, MAPPER);
    }

    @Override
    public Optional<ClienteModel> findById(String id){
        String sql = """
                SELECT 
                    ID_CLIENTE,
                    NOMBRE,
                    APATERNO,
                    AMATERNO,
                    EMAIL,
                    FECHA_ALTA,
                    ESTADO
                FROM
                    CLIENTES
                WHERE
                    ID_CLIENTE = 1
                """;

        return JDBCTemplate.query(sql, MAPPER, id).stream().findFirst();
    }

    @Override
    public ClienteModel save(ClienteModel cliente){
        String sql = """
                INSERT INTO CLIENTES
                    (NOMBRE, APATERNO, AMATERNO, EMAIL, ESTADO)
                VALUES
                    (?,?,?,?,?)
                """;

        JDBCTemplate.update(
                sql,
                cliente.getNombre(),
                cliente.getAPaterno(),
                cliente.getAMaterno(),
                cliente.getEmail(),
                cliente.getEstado()
        );

        return cliente;
    }

    @Override
    public ClienteModel update(String id, ClienteModel cliente){
        String sql = """
                UPDATE CLIENTES
                SET
                    NOMBRE=?, APATERNO=?, AMATERNO=?, EMAIL?=, ESTADO=?
                WHERE
                    ID_CLIENTE=?
                """;

        JDBCTemplate.update(
                sql,
                cliente.getNombre(),
                cliente.getAPaterno(),
                cliente.getAMaterno(),
                cliente.getEmail(),
                cliente.getEstado(),
                id
        );

        cliente.setIdCliente(id);
        return cliente;
    }

    @Override
    public void deleteLogical(String id){
        String sql = """
                UDPDATE
                    CLIENTES
                SET
                    ESTADO = 0
                WHERE
                    ID_CLIENTE = ?
                """;

        JDBCTemplate.update(sql, id);
    }
}