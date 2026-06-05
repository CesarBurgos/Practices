package com.curso.projectweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//Reto de crearlo a interfaces y clases abstractas

@SpringBootApplication
public class ProjectwebApplication {
	public static void main(String[] args) {
        System.out.println(new BCryptPasswordEncoder().encode("test"));

		SpringApplication.run(ProjectwebApplication.class, args);
	}
}
