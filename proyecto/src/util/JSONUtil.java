package util;


import dto.ClienteRequestDTO;
import model.Cliente;
import java.util.List;

public class JSONUtil {

    public static String clienteToJSON(Cliente c){
        return "{"
                + "\"idCliente\":\"" + c.getIdCliente() + "\","
                + "\"nombre\":\"" + c.getNombre() + "\","
                + "\"aPaterno\":\"" + c.getaPaterno() + "\","
                + "\"aMaterno\":\"" + c.getaMaterno() + "\","
                + "}";
    }

    public static String clientesToJSON(List<Cliente> clientes){
        StringBuilder json =  new StringBuilder("[");

        for(int i=0; i<clientes.size(); i++){
            json.append(clienteToJSON(clientes.get(i)));

            if(i<clientes.size() -1) {
                json.append(",");
            }
        }

        json.append("]");

        return json.toString();
    }

    public static ClienteRequestDTO jsonToClienteRequest(String body){
        body = body.replace("{", "")
                .replace("}","")
                .replace("\"", "");

        String[] parts = body.split(",");

        String id = null;
        String nombre = null;
        String aPaterno = null;
        String aMaterno = null;

        for(String p: parts){
            String[] kv = p.split(":");

            String key = kv[0].trim();
            String value = kv[1].trim();

            switch(key){
                case "idCliente":
                    id = value;
                    break;

                case "nombre":
                    nombre = value;
                    break;

                case "aPaterno":
                    aPaterno = value;
                    break;

                case "aMaterno":
                    aMaterno = value;
                    break;
            }
        }

        return new ClienteRequestDTO(
                id,
                nombre,
                aPaterno,
                aMaterno
        );
    }
}
