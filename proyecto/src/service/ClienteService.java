package service;

// Logica del negocio

import dto.ClienteRequestDTO;
import model.Cliente;
import repository.ClienteRepository;
import util.UUIDUtil;

import java.util.List;
import java.util.UUID;

public class ClienteService {
    private ClienteRepository repo = new ClienteRepository();

    public List<Cliente> listar(){
        return repo.listar();
    }

    public Cliente buscar(String id){
        return repo.buscar(id);
    }

    public void crear(ClienteRequestDTO dto){
        Cliente c = new Cliente();

        c.setIdCliente(UUIDUtil.generateUUID());
        c.setNombre(dto.nombre());
        c.setaPaterno(dto.aPaterno());
        c.setaMaterno(dto.aMaterno());

        repo.crear(c);
    }

    public void actualizar(ClienteRequestDTO dto){
        Cliente c = new Cliente();

        c.setNombre(dto.nombre());
        c.setaPaterno(dto.aPaterno());
        c.setaMaterno(dto.aMaterno());

        repo.actualizar(dto.idCliente(), c);
    }

    public void eliminar(String id){
        repo.eliminarLogico(id);
    }
}
