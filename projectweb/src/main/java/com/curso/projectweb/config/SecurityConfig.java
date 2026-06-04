package com.curso.projectweb.config;

import com.curso.projectweb.filter.JwtRequestFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import com.curso.projectweb.util.Util;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

// @Configuration indica que esta clse define configuracion
// personalizada para Spring
@Configuration
public class SecurityConfig {
    // Inyectamos muestro filtro JWT personalizado
    @Autowired private JwtRequestFilter jwtRequestFilter;

    // ===================================
    // CONFIGURACIÓN PRINCIPAL DE SEGURIDAD
    // ===================================
    @Bean
    SecurityFilterChain web(HttpSecurity http) throws Exception{
        http
                // Habilita CORS con configuración por defecto
                .cors(Customizer.withDefaults())
                // Deshanilita CRSF
                // Se desactiva porque estamos usadno JWT (stateless)
                .csrf(crf -> crf.disable())

                // Configuración de autorización
                .authorizeHttpRequests((autorize) -> autorize
                        //ENDPOINTS SIN AUTORIZACIÓN
                        //Permite acceso libre a rutas de autenticación
                        .requestMatchers(Util.AUTHENDPOINT,
                                Util.REFRESHENDPOINT,
                                Util.MESSAGECREATE,
                                Util.PREREGISTERENDPOINT,
                                Util.VERIFYENDPOINT,
                                Util.ACTIVATEACCOUNTENDPOINT,
                                Util.CATESTADOENDPOINT,
                                Util.CATCIUDADENDPOINT).permitAll()

                        // Cualquier otra petición requiere autenticación
                        .anyRequest().authenticated()
                )
                // Agregamos nuesto filtro JWT antes del filtro de autenticación tradicional
                .addFilterBefore(
                        jwtRequestFilter,
                        UsernamePasswordAuthenticationFilter.class
                )
                // Indicamos que NO usaremos sesiones
                // Cada request debe traer su token
                .sessionManagement((session )-> session
                        .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                );

        // Construimos la confiduración final
        return http.build();
    }

    // ===================================
    // ENCODER DE PASSWORDS
    // ===================================
    @Bean
    PasswordEncoder passwordEncoder(){
        // BCrypt es un algoritmo de hashing seguro
        return new BCryptPasswordEncoder();
    }

    // ===================================
    // AUTHENTICATION MANAGER
    // ===================================
    @Bean
    AuthenticationManager authenticationManager(AuthenticationConfiguration authenticationConfiguration) throws Exception{
        // Obtiene el AuthenticationManager
        // que Spring configura automaticamente
        return authenticationConfiguration.getAuthenticationManager();
    }
}
