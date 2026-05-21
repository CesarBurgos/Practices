package controller;

// Implementar las peticiones del servidor

import dto.ClienteRequestDTO;
import model.Cliente;
import service.ClienteService;
import util.APIConstants;
import util.JSONUtil;

public class ClienteController {
    private ClienteService service = new ClienteService();

    public String listar(){
        try{
            String data = JSONUtil.clientesToJSON(service.listar());

            return "{"
                    + "\"success\": " + APIConstants.OKSUCCESS + ","
                    + "\"mensaje\": " + APIConstants.OKQUERY + "\","
                    + "\"error\": null,"
                    + "\"data\":" + data
                    + "}";
        } catch (Exception e) {
            return "{"
                    + "\"success\": " + APIConstants.ERRORSUCCESS + ","
                    + "\"mensaje\": " + APIConstants.ERRORQUERY + "\","
                    + "\"error\": " + e.getMessage() + "\""
                    + "}";
        }
    }

    public String buscar(String id){
        try{
            Cliente cliente = service.buscar(id);

            if(cliente == null) {
                return "{"
                        + "\"success\": " + APIConstants.ERRORSUCCESS + ","
                        + "\"mensaje\": \"" + APIConstants.ERRORNOTFOUND + "\""
                        + "}";
            }

            String data =  JSONUtil.clienteToJSON(cliente);

            return "{"
                    + "\"success\": " + APIConstants.OKSUCCESS + ","
                    + "\"mensaje\": " + APIConstants.OKFOUND + "\","
                    + "\"error\": null,"
                    + "\"data\":" + data
                    + "}";
        } catch (Exception e) {
            return "{"
                    + "\"success\": " + APIConstants.ERRORSUCCESS + ","
                    + "\"mensaje\": " + APIConstants.ERRORQUERY + "\","
                    + "\"error\": " + e.getMessage() + "\""
                    + "}";
        }
    }
    public String crear(String body){
        try{
            ClienteRequestDTO dto = JSONUtil.jsonToClienteRequest(body);
            service.crear(dto);

            return "{"
                    + "\"success\": " + APIConstants.OKSUCCESS + ","
                    + "\"mensaje\": " + APIConstants.OKCREATE + "\","
                    + "}";

        } catch (Exception e) {
            return "{"
                    + "\"success\": " + APIConstants.ERRORSUCCESS + ","
                    + "\"mensaje\": " + APIConstants.ERRORGENERAL + "\","
                    + "\"error\": " + e.getMessage() + "\""
                    + "}";
        }
    }

    public String actualizar(String body){
        try{
            ClienteRequestDTO dto = JSONUtil.jsonToClienteRequest(body);

            service.actualizar(dto);

            return "{"
                    + "\"success\": " + APIConstants.OKSUCCESS + ","
                    + "\"mensaje\": \"" + APIConstants.OKUPDATE + "\""
                    + "}";
        } catch (Exception e) {
            return "{"
                    + "\"success\": " + APIConstants.ERRORSUCCESS + ","
                    + "\"mensaje\": " + APIConstants.ERRORGENERAL + "\","
                    + "\"error\": " + e.getMessage() + "\""
                    + "}";
        }
    }

    public String eliminar(String id){
        try{
            service.eliminar(id);

            return "{"
                    + "\"success\": " + APIConstants.OKSUCCESS + ","
                    + "\"mensaje\": \"" + APIConstants.OKDELETE + "\""
                    + "}";
        }catch (Exception e) {
            return "{"
                    + "\"success\": " + APIConstants.ERRORSUCCESS + ","
                    + "\"mensaje\": " + APIConstants.ERRORGENERAL + "\","
                    + "\"error\": " + e.getMessage() + "\""
                    + "}";
        }
    }
}
