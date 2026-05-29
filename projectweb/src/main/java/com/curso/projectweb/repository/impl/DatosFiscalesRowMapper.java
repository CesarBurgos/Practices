package com.curso.projectweb.repository.impl;

import com.curso.projectweb.model.DatosFiscalesModel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatosFiscalesRowMapper implements RowMapper<DatosFiscalesModel> {

    @Override
    public DatosFiscalesModel mapRow(ResultSet rs, int rowNum) throws SQLException {

        DatosFiscalesModel datos = new DatosFiscalesModel();

        datos.setIdDatosfic(rs.getString("ID_DATOSFIC"));
        datos.setIdCliente(rs.getString("ID_CLIENTE"));
        datos.setRazonSocial(rs.getString("RAZON_SOCIAL"));
        datos.setRfc(rs.getString("RFC"));
        datos.setCodigoPostal(rs.getString("CODIGO_POSTAL"));
        datos.setIdTipoCliente(rs.getString("ID_TIPO_CLIENTE"));
        datos.setUsoCFDI(rs.getString("USO_CFDI"));
        datos.setEmail(rs.getString("EMAIL"));
        datos.setDEstado(rs.getString("D_ESTADO"));
        datos.setDCiudad(rs.getString("D_CIUDAD"));
        datos.setDColonia(rs.getString("D_COLONIA"));
        datos.setDZona(rs.getString("D_ZONA"));
        datos.setCreatedAt(rs.getDate("CREATED_AT"));
        datos.setStatus(rs.getInt("STATUS"));

        return datos;
    }
}
