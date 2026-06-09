package com.lr.ulapedidos.repository;

import com.lr.ulapedidos.model.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface PedidoRepository extends JpaRepository<PedidoModel, Integer> {
    List<PedidoModel> findByClienteIdClienteAndEstado(Integer idCliente, Integer estado);
    List<PedidoModel> findByEstado(Integer estado);
}
