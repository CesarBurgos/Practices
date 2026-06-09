package com.lr.ulapedidos.repository;

import com.lr.ulapedidos.model.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

// URL DOCUMENTACION:
// https://docs.spring.io/spring-data/jpa/reference/jpa/query-methods.html

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaModel, Integer> {
    List<CategoriaModel> findByEstado(Integer estado);
}
