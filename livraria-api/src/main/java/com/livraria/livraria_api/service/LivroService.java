package com.livraria.livraria_api.service;

import com.livraria.livraria_api.domain.model.Livro;

public interface LivroService {
    Livro findById(Long id);

    Livro create(Livro livroToCreate);
}

