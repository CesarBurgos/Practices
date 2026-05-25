package repository;

import connection.OracleConnection;
import model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    public List<Cliente> listar (){
        List<Cliente> lista = new ArrayList<>();

        try{
            // Definiendo instancia a la conexión
            Connection conn = OracleConnection.getInstance().getConnection();

            String sql = """
                    SELECT ID_CLIENTE, NOMBRE, APATERNO, AMATERNO, FECHA_ALTA, ESTADO
                    FROM CLIENTES
                    WHERE ESTADO = 1
                    """;

            // Estableciendo conexión
            Statement st =  conn.createStatement();

            //Ejecutando Query
            ResultSet rs = st.executeQuery(sql);

            // Recorre los registros retornados del select
            while(rs.next()){
                Cliente c =  new Cliente();
                c.setIdCliente(rs.getString("ID_CLIENTE"));
                c.setNombre(rs.getString("NOMBRE"));
                c.setaPaterno(rs.getString("APATERNO"));
                c.setaMaterno(rs.getString("AMATERNO"));
                c.setFechaAlta(rs.getDate("FECHA_ALTA"));
                c.setEstado(rs.getInt("ESTADO"));
                lista.add(c);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return lista;
    }

    public void crear(Cliente c){
        try{
            // Definiendo instancia a la conexión
            Connection conn = OracleConnection.getInstance().getConnection();

            String sql = """
                    INSERT INTO CLIENTES
                    (ID_CLIENTE, NOMBRE, APATERNO, AMATERNO, ESTADO)
                    VALUES (?,?,?,?,1)
                    """;

            // Preparando query
            PreparedStatement ps = conn.prepareStatement(sql);

            // Cargando parametros
            ps.setString(1, c.getIdCliente());
            ps.setString(2, c.getNombre());
            ps.setString(3, c.getaPaterno());
            ps.setString(4, c.getaMaterno());

            // Imprimiendo procesos
            System.out.println("SQL: " + sql);
            System.out.println("param 1 ID_CLIENTE: " + c.getIdCliente());
            System.out.println("param 2 NOMBRE: " + c.getNombre());
            System.out.println("param 3 APATERNO: " + c.getaPaterno());
            System.out.println("param 4 AMATERNO: " + c.getaMaterno());

            // Ejecutando Query
            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public Cliente buscar(String id){
        try{
            // Definiendo instancia a la conexión
            Connection conn = OracleConnection.getInstance().getConnection();

            String sql = """
                    SELECT
                     ID_CLIENTE, NOMBRE, APATERNO, AMATERNO, FECHA_ALTA, ESTADO
                    FROM CLIENTES
                    WHERE ID_CLIENTE = ?
                    AND ESTADO = 1
                    """;

            // Preparando query
            PreparedStatement ps = conn.prepareStatement(sql);

            // Cargando parametros
            ps.setString(1, id);

            ResultSet rs = ps.executeQuery();

            // Recorre los registros retornados del select
            while(rs.next()){
                Cliente c =  new Cliente();
                c.setIdCliente(rs.getString("ID_CLIENTE"));
                c.setNombre(rs.getString("NOMBRE"));
                c.setaPaterno(rs.getString("APATERNO"));
                c.setaMaterno(rs.getString("AMATERNO"));
                c.setFechaAlta(rs.getDate("FECHA_ALTA"));
                c.setEstado(rs.getInt("ESTADO"));

                return c;
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }

    public void actualizar(String id, Cliente c){
        try{
            // Definiendo instancia a la conexión
            Connection conn = OracleConnection.getInstance().getConnection();

            String sql = """
                    UPDATE CLIENTES
                    SET NOMBRE = ?,
                    APATERNO = ?,
                    AMATERNO = ?
                    WHERE ID_CLIENTE = ?
                    """;

            // Preparando query
            PreparedStatement ps = conn.prepareStatement(sql);

            // Cargando parametros
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getaPaterno());
            ps.setString(3, c.getaMaterno());
            ps.setString(4, id);

            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void eliminarLogico(String id){
        try{
            // Definiendo instancia a la conexión
            Connection conn = OracleConnection.getInstance().getConnection();

            String sql = """
                UPDATE CLIENTES
                SET ESTADO = 0
                WHERE ID_CLIENTE = ?
                """;

            // Preparando query
            PreparedStatement ps = conn.prepareStatement(sql);

            // Cargando parametros
            ps.setString(1, id);

            ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
