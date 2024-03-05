package org.example.estudantes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EstudantesApplication {

    public static void main(String[] args) {
        SpringApplication.run(EstudantesApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello meu amigo";
    }

}
