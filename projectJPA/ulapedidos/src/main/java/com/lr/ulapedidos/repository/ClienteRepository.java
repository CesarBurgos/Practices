package com.lr.ulapedidos.repository;

import com.lr.ulapedidos.model.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteModel, Integer> {
    List<ClienteModel> findByEstado(Integer estado);
}
