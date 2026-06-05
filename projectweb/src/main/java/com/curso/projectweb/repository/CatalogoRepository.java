package com.curso.projectweb.repository;

import com.curso.projectweb.model.CatalogoModel;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class CatalogoRepository implements ICatalogoRepository{
    @Autowired
    private JdbcTemplate JDBCTemplate;

    @Override
    public List<CatalogoModel> obtenerCatalogo(
            String tabla,
            String columnaId,
            String columnaDescription
    ) {
        String sql = String.format("""
                                    SELECT
                                        %s AS ID,
                                        %s AS DESCRIPTION
                                    FROM %s
                                    WHERE
                                        ESTADO = 0
                                    """,
                                    columnaId,
                                    columnaDescription,
                                    tabla);
        return JDBCTemplate.query(
                sql,
                (rs, rowNum) -> new CatalogoModel(
                                                            rs.getString("ID"),
                                                            rs.getString("DESCRIPTION")
                                            )
        );
    }

    @Override
    public List<CatalogoModel> obtenerCiudadesPorEstado(String UUIDEstado){
        String sql = """
                SELECT
                    UUID_CIUDAD AS ID,
                    DESCRIPTION
                FROM
                    CAT_CIUDAD
                WHERE
                    UUID_ESTADO = ?
                    AND ESTADO = 0
                ORDER BY DESCRIPTION
                """;

        return JDBCTemplate.query(
                sql,
                new Object[]{UUIDEstado},
                (rs, rowNum) -> new CatalogoModel(
                        rs.getString("ID"),
                        rs.getString("DESCRIPTION")
                )
        );
    }
}