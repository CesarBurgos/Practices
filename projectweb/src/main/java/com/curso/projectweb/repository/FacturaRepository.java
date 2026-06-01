package com.curso.projectweb.repository;

import com.curso.projectweb.model.FacturaModel;
import com.curso.projectweb.repository.impl.FacturaRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class FacturaRepository implements IFacturaRepository {
    private final JdbcTemplate JDBCTemplate;
    private FacturaRowMapper MAPPER = new FacturaRowMapper();

    @Override
    public List<FacturaModel> findAll(){
        String sql = """
                SELECT
                    ID_FACTURA,
                    ID_CLIENTE,
                    MONTO_TOTAL,
                    FOLIO,
                    ANIO,
                    ID_ESTADO_FACTURA,
                    FECHA_FACTURA
                FROM
                    FACTURAS
                """;
        return JDBCTemplate.query(sql, MAPPER);
    }

    @Override
    public List<FacturaModel> findByCliente(String IDCliente){
        String sql = """
                SELECT
                    ID_FACTURA,
                    ID_CLIENTE,
                    MONTO_TOTAL,
                    FOLIO,
                    ANIO,
                    ID_ESTADO_FACTURA,
                    FECHA_FACTURA
                FROM
                    FACTURAS
                WHERE
                    ID_CLIENTE = ?
                """;
        return JDBCTemplate.query(sql, MAPPER, IDCliente);
    }

    @Override
    public Optional<FacturaModel> findById(String ID){
        String sql = """
                SELECT
                    ID_FACTURA,
                    ID_CLIENTE,
                    MONTO_TOTAL,
                    FOLIO,
                    ANIO,
                    ID_ESTADO_FACTURA,
                    FECHA_FACTURA
                FROM
                    FACTURAS
                WHERE
                    ID_FACTURA = ?
                """;
        return JDBCTemplate.query(sql, MAPPER, ID).stream().findFirst();
    }

    public FacturaModel save(FacturaModel factura){
        String sql = """
                INSERT INTO FACTURAS
                    (
                        ID_CLIENTE,
                        MONTO_TOTAL,
                        FOLIO,
                        ANIO,
                        ID_ESTADO_FACTURA
                    )
                VALUES
                    (?,?,?,?,?)
                """;

        JDBCTemplate.update(sql,
                factura.getIdCliente(),
                factura.getMontoTotal(),
                factura.getFolio(),
                factura.getAnio(),
                factura.getIdEstadoFactura());

        return factura;
    }

    public FacturaModel update(String ID, FacturaModel factura){
        String sql = """
                UPDATE FACTURAS
                SET
                    MONTO_TOTAL = ?,
                    ID_ESTADO_FACTURA = ?
                WHERE
                    ID_FACTURA = ?
                """;

        JDBCTemplate.update(
                sql,
                factura.getMontoTotal(),
                factura.getIdEstadoFactura(),
                ID);

        return factura;
    }

    public boolean existsCliente(String idCliente){
        String sql = """
                SELECT
                    COUNT(1)
                FROM
                    CLIENTES
                WHERE
                    ID_CLIENTE = ?
                    AND ESTADO = 1
                """;

        Integer count = JDBCTemplate.queryForObject(sql, Integer.class, idCliente);

        return count != null && count > 0;
    }

    public boolean existsEstadoFactura(String idEstadoFactura){
        String sql = """
                SELECT
                    COUNT(1)
                FROM
                    CAT_ESTADO_FACTURA
                WHERE
                    ID_ESTADO_FACTURA = ?
                """;

        Integer count = JDBCTemplate.queryForObject(sql, Integer.class, idEstadoFactura);

        return count != null && count > 0;
    }
}
