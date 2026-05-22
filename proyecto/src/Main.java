// Comportamiento de un servidor --- EMULANDO UN TOMCAT

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import controller.ClienteController;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.lang.Integer;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer port = 8080;
        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);
        ClienteController controller = new ClienteController();

        //LISTAR CLIENTES
        server.createContext("/clientes/list", exchange -> {
            if(!isMethod(exchange, "GET")) return;
            String response = controller.listar();

            //System.out.println(response);

            sendResponse(exchange, response);
        });

        //BUSCAR CLIENTE
        server.createContext("/clientes/get", exchange -> {
            if(!isMethod(exchange, "GET")) return;

            String id = getQueryParam(exchange, "id");

            if(id == null){
                sendResponse(exchange, jsonError("ID requerido"));
                return;
            }

            String response = controller.buscar(id);
            sendResponse(exchange, response);
        });

        // CREAR CLIENTE
        server.createContext("/clientes/create", exchange -> {
            if(!isMethod(exchange, "POST")) return;

            String body = getBody(exchange);

            String response = controller.crear(body);
            sendResponse(exchange, response);
        });

        // ACTUALIZAR CLIENTE
        server.createContext("/clientes/update", exchange -> {
            if(!isMethod(exchange, "PUT")) return;

            String body = getBody(exchange);

            String response = controller.actualizar(body);
            sendResponse(exchange, response);
        });

        // ELIMINAR CLIENTE
        server.createContext("/clientes/delete", exchange -> {
            if(!isMethod(exchange, "DELETE")) return;

            String id = getQueryParam(exchange, "id");

            if (id == null){
                sendResponse(exchange, jsonError("ID requerido"));
                return;
            }

            String response = controller.eliminar(id);
            sendResponse(exchange, response);
        });

        InetAddress ip = InetAddress.getLocalHost();

        System.out.println("Servidor iniciado");
        System.out.println("IP: " + ip.getHostAddress());
        System.out.println("Puerto: " + port.toString());

        server.start();
        //System.out.println("Sevidor iniciado en puerto 8080");*/
    }

    // ========
    // HELPES
    // ========

    /*private static void sendResponse(HttpExchange exchange, String response) throws IOException{
        int statusCode = response.contains("\"success\":false") ? 400: 200;

        exchange.getRequestHeaders().add("Content-Type", "application/json");
        exchange.sendResponseHeaders(statusCode, response.getBytes().length);

        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }*/

    private static void sendResponse(HttpExchange exchange, String response) throws IOException {
        int statusCode = response.contains("\"success\":false") ? 400 : 200;
        exchange.getResponseHeaders().add("Content-Type", "application/json");
        exchange.sendResponseHeaders(statusCode, response.getBytes().length);
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    private static boolean isMethod(HttpExchange exchange, String method) throws IOException{
        if(!exchange.getRequestMethod().equalsIgnoreCase(method)){
            sendResponse(exchange, jsonError("Método no permitido"));
            return false;
        }

        return true;
    }

    private static String getBody(HttpExchange exchange) throws IOException{
        InputStream is = exchange.getRequestBody();
        return new String(is.readAllBytes());
    }

    private static String getQueryParam(HttpExchange exchange, String param) throws IOException{
        String query = exchange.getRequestURI().getQuery();

        if(query == null) return null;

        String[] params = query.split("&");

        for(String p: params){
            String[] keyValue = p.split("=");
            if(keyValue.length == 2 && keyValue[0].equals(param)){
                return  keyValue[1];
            }
        }
        return null;
    }

    private static String jsonError(String str){
        return "{"
                + "\"success\": false,"
                + "\"mensaje\": \"" + str + "\""
                + "}";
    }
}