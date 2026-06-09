package com.lr.ulapedidos.service;

import com.lr.ulapedidos.model.CategoriaModel;
import com.lr.ulapedidos.repository.CategoriaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import com.lr.ulapedidos.util.UtilConstants;

@Service
@RequiredArgsConstructor
public class CategoriaService {
    private final CategoriaRepository repository;

    public CategoriaModel guardar(CategoriaModel categoria){
        return repository.save(categoria);
    }

    public List<CategoriaModel> listar(){
        return repository.findByEstado(UtilConstants.CODEPOS);
    }

    public CategoriaModel buscarPorId(Integer id){
        return repository.findById(id).orElseThrow(() -> new RuntimeException(UtilConstants.MSG14));
    }

    public CategoriaModel actualizar(Integer id, CategoriaModel request){
        CategoriaModel categoria = buscarPorId(id);

        categoria
                .setNombre(request.getNombre())
                .setDescription(request.getDescription());

        return repository.save(categoria);
    }

    public void eliminar(Integer id){
        CategoriaModel categoria = buscarPorId(id);
        categoria.setEstado(UtilConstants.CODENEG);

        repository.save(categoria);
    }
}
