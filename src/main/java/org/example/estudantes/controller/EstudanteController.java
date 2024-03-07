package org.example.estudantes.controller;

import jakarta.websocket.server.ServerEndpoint;
import lombok.AllArgsConstructor;
import org.example.estudantes.entity.Estudante;
import org.example.estudantes.service.EstudanteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/estudantes")
@AllArgsConstructor
public class EstudanteController {

    private EstudanteService estudanteService;

    @GetMapping("/{id}")
    public ResponseEntity<Estudante> buscarEstudantePorId(@PathVariable Long id) {
        return estudanteService.buscarEstudantePorId(id);
    }

    @GetMapping
    public List<Estudante> buscarTodosEstudantes() {
        return estudanteService.buscarTodosEstudantes();
    }

    @PostMapping
    public ResponseEntity<Estudante> cadastrarEstudante(@RequestBody Estudante estudante) {
        return estudanteService.cadastrarEstudante(estudante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudante> atualizarEstudante(@PathVariable Long id, @RequestBody Estudante estudante) {
        return estudanteService.atualizarEstudante(estudante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> removerEstudante(@PathVariable Long id) {
        return estudanteService.removerEstudante(id);
    }
}
