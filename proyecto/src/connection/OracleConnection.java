package connection;

import config.EnvLoader;

import java.sql.Connection;
import java.sql.DriverManager;

public class OracleConnection {
    private static OracleConnection instance;
    private Connection connection;

    private OracleConnection(){
        try {
            String url = "jdbc:oracle:thin:@"
                    + EnvLoader.get("DB_HOST")
                    + ":"
                    + EnvLoader.get("DB_PORT")
                    + "/"
                    + EnvLoader.get("DB_SERVICE");

            connection = DriverManager.getConnection(
                    url,
                    EnvLoader.get("DB_USER"),
                    EnvLoader.get("DB_PASSWORD")
            );
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static OracleConnection getInstance(){
        if(instance == null){
            instance = new OracleConnection();
        }

        return instance;
    }

    public Connection getConnection(){
        return connection;
    }
}