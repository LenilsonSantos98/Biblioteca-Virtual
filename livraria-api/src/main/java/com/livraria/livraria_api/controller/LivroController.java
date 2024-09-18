package com.livraria.livraria_api.controller;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.livraria.livraria_api.domain.model.Livro;
import com.livraria.livraria_api.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
    
    private final LivroService livroService;

    public LivroController(LivroService livroService){
        this.livroService = livroService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> findById(@PathVariable Long id){
        var livro =livroService.findById(id);
        return ResponseEntity.ok(livro);
    }

    @PostMapping
    public ResponseEntity<Livro> create(@RequestBody Livro livroToCreate) {
        var livroCreated = livroService.create(livroToCreate);
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
             .path("/{id}")
             .buildAndExpand(livroCreated.getId())
             .toUri();
        return ResponseEntity.created(location).body(livroCreated);
    }
}
