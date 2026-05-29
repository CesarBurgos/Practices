package com.curso.projectweb.model;

import lombok.Data;
import java.util.Date;
import java.math.BigDecimal;

@Data
public class PagoModel {
    private String idPago;
    private String idFactura;
    private BigDecimal monto;
    private String idEstadoPago;
    private Date fechaPago;
}
