package com.curso.projectweb.repository;

import com.curso.projectweb.model.DatosFiscalesModel;
import com.curso.projectweb.repository.impl.DatosFiscalesRowMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class DatosFiscalesRepository implements IDatosFiscalesRepository{
    private final JdbcTemplate JDBCTemplate;
    private final DatosFiscalesRowMapper MAPPER = new DatosFiscalesRowMapper();

    @Override
    public List<DatosFiscalesModel> findAll(){
        String sql = """
                SELECT
                    *
                FROM
                    DATOS_FISCALES
                WHERE
                    STATUS = 1
                """;

        return JDBCTemplate.query(sql, MAPPER);
    }

    @Override
    public Optional<DatosFiscalesModel> findById(String ID){
        String sql = """
                SELECT
                    *
                FROM
                    DATOS_FISCALES
                WHERE
                    ID_DATOSFIC = ?
                """;

        return JDBCTemplate.query(sql, MAPPER, ID).stream().findFirst();
    }

    @Override
    public Optional<DatosFiscalesModel> findByRFC(String RFC){
        String sql = """
                SELECT
                    *
                FROM
                    DATOS_FISCALES
                WHERE
                    RFC = ?
                """;

        return JDBCTemplate.query(sql, MAPPER, RFC).stream().findFirst();
    }

    @Override
    public DatosFiscalesModel save(DatosFiscalesModel datos){
        String sql = """
                INSERT INTO DATOS_FISCALES
                    (
                        ID_CLIENTE,
                        RAZON_SOCIAL,
                        RFC,
                        CODIGO_POSTAL,
                        ID_TIPO_CLIENTE,
                        USO_CFDI,
                        EMAIL,
                        D_ESTADO,
                        D_CIUDAD,
                        D_COLONIA,
                        D_ZONA,
                        STATUS
                    )
                VALUES
                    (?,?,?,?,?,?,?,?,?,?,?,?)
                """;

        JDBCTemplate.update(sql,
                    datos.getIdCliente(),
                    datos.getRazonSocial(),
                    datos.getRfc(),
                    datos.getCodigoPostal(),
                    datos.getIdTipoCliente(),
                    datos.getUsoCFDI(),
                    datos.getEmail(),
                    datos.getDEstado(),
                    datos.getDCiudad(),
                    datos.getDColonia(),
                    datos.getDZona(),
                    datos.getStatus()
                );

        return datos;
    }

    @Override
    public DatosFiscalesModel update(String ID, DatosFiscalesModel datos){
        String sql = """
                UPDATE DATOS_FISCALES
                SET
                    RAZON_SOCIAL = ?,
                    CODIGO_POSTAL = ?,
                    ID_TIPO_CLIENTE = ?,
                    USO_CDFI = ?,
                    EMAIL = ?,
                    D_ESTADO = ?,
                    D_CIUDAD = ?,
                    D_COLONIA = ?,
                    D_ZONA = ?
                WHERE
                    ID_DATOSFIC = ?
                """;

        JDBCTemplate.update(sql,
                datos.getRazonSocial(),
                datos.getCodigoPostal(),
                datos.getIdTipoCliente(),
                datos.getUsoCFDI(),
                datos.getEmail(),
                datos.getDEstado(),
                datos.getDCiudad(),
                datos.getDColonia(),
                datos.getDZona(),
                ID
        );

        datos.setIdDatosfic(ID);

        return datos;
    }

    @Override
    public void deleteLogical(String ID){
        String sql = """
                UPDATE
                    DATOS_FISCALES
                SET
                    STATUS = 0
                WHERE
                    ID_DATOSFIC = ?
                """;

        JDBCTemplate.update(sql, ID);
    }

    @Override
    public boolean existsCliente(String ID){
        String sql = """
                SELECT
                    COUNT(1)
                FROM
                    CLIENTES
                WHERE
                    ID_CLIENTE = ?
                    AND ESTADO = 1
                """;

        Integer count = JDBCTemplate.queryForObject(sql, Integer.class, ID);

        return count != null && count > 0;
    }

    @Override
    public boolean existsTipoCliente(String IDTipoCliente){
        String sql = """
                SELECT
                    COUNT(1)
                FROM
                    CAT_TIPO_CLIENTE
                WHERE
                    ID_TIPO_CLIENTE = ?
                """;

        Integer count = JDBCTemplate.queryForObject(sql, Integer.class, IDTipoCliente);

        return count != null && count > 0;
    }
}
