package com.livraria.livraria_api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.livraria.livraria_api.domain.model.Livro;
import com.livraria.livraria_api.domain.repository.LivroRepository;
import com.livraria.livraria_api.service.LivroService;

@Service
public class LivroServiceImpl extends BaseServiceImpl<Livro, Long> implements LivroService {

    private final LivroRepository livroRepository;

    public LivroServiceImpl(LivroRepository livroRepository){
        super(livroRepository);
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
    public List<Livro> findByTitulo(String titulo) {
        return livroRepository.findByTituloContaining(titulo);
    }

    
}
