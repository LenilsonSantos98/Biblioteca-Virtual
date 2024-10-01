package com.livraria.livraria_api.service;

import java.util.List;

import com.livraria.livraria_api.domain.model.Livro;

public interface LivroService extends BaseService<Livro,  Long> {
    
    List<Livro> findByTitulo(String titulo);

    
}

