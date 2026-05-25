package dto;

public record ClienteRequestDTO (
    String idCliente,
    String nombre,
    String aPaterno,
    String aMaterno
){}
