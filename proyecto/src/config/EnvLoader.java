package config;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class EnvLoader {
    private static Map<String, String> env =  new HashMap<>();

    static {
        try {
            BufferedReader br = new BufferedReader(new FileReader(".env"));
            String line;

            while((line = br.readLine()) != null){
                // Leyendo archivo
                if(line.trim().isEmpty()) continue;

                // Partiendo el env, key = value
                String[] parts = line.split("=", 2);

                // llenando JSON
                env.put(parts[0], parts[1]);
            }

        } catch (Exception e) {
            System.out.println("Error en la lectura del archivo");
        }
    }

    public static String get(String key){
        return env.get(key);
    }
}
