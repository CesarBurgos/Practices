package com.curso.projectweb.repository;

import com.curso.projectweb.model.userModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

//@Repository indica a Spring que esta clase
// Es un componente de acceso a BD (DAO)
// Tambien permite que Spring maneje excepciones de BDs

@Repository
public class UserRepository implements IUserRepository{
   //@Autowired, permite que Spring inyecte automáticamente
   // una instancia de JDBCTemplate
   @Autowired
   private JdbcTemplate JDBCTemplate;

   // Implementamos el método definido en la interfaz
   @Override
    public userModel findByEmail(String correo){
       String sql = """
               SELECT
                    *
               FROM
                    VM_USUARIOS_ACTIVOS
               WHERE
                    UPPER(CORREO) = UPPER(?)
               """;
       try{
           return JDBCTemplate.queryForObject(
                   sql,
                   new Object[]{correo},
                   new BeanPropertyRowMapper<>(userModel.class)
           );
       }catch(EmptyResultDataAccessException e){
           return null;
       }
   }
}
