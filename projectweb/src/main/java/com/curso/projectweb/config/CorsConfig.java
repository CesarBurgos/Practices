package com.curso.projectweb.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import java.lang.reflect.Array;
import java.util.Arrays;

// Indica que esta clase es una clase de configuración de Spring
// Es decir, aquí definimos beans y configuraciones personalizadas
@Configuration
public class CorsConfig {
    // @Bean le dice a Spring que el método devuelve un objeto
    // que debe registrarse en el contenedor de Spring (IoC)
    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        // Creamos un objeto CorsConfiguration
        // Aquí definimos las reglas de CORS (Cross-Origin Resource Sharing)
        CorsConfiguration configuration = new CorsConfiguration();

        // Permite enciar credenciales a las peticiones
        // (cookies, headers de autorización, sesiones, etc.)
        configuration.setAllowCredentials(true);

        // LISTA BLANCA
        // Define que origenes (dominios) pueden consumir nuestra API
        // En este caso solo permitimos Angular corriendo en localhosto:4200
        // Para usarse en una VirtualHost
        //configuration.setAllowedOrigins(Arrays.asList("http://app.curso"));

        configuration.setAllowedOrigins(Arrays.asList("*"));

        // Define los métodos HTTP permitidos
        // Solo estas operaciones podrán ejecutarse desde le frontend
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "PATCH"));

        //Define que headers estan permitidos
        // "*" significa que se permiten todos los headers
        configuration.setAllowedHeaders(Arrays.asList("*"));

        //UrlBasedCorsConfigurationSource permite aplicar la configuración
        // CORS a rutas especificas de la aplicación
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        // Registramos la configuración CORSS para todas las rutas(/**)
        // Esto significa que aplica todos los endpoints del backend
        source.registerCorsConfiguration("/**", configuration);

        // Retornamos la configuración para que Spring la use
        return source;

    }
}