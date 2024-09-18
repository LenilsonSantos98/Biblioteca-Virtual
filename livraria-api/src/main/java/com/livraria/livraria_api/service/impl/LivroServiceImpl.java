package com.livraria.livraria_api.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import com.livraria.livraria_api.domain.model.Livro;
import com.livraria.livraria_api.domain.repository.LivroRepository;
import com.livraria.livraria_api.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService {

    private final LivroRepository livroRepository;

    public LivroServiceImpl(LivroRepository livroRepository){
        this.livroRepository = livroRepository;
    }

    @Override
    public Livro create(Livro livroToCreate) {
        if(livroRepository.existsByIsbn(livroToCreate.getIsbn())){
            throw new IllegalArgumentException("Este ISBN já está cadastrado.");
        }
        return livroRepository.save(livroToCreate);
    }

    @Override
    public Livro findById(Long id) {
        return livroRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
