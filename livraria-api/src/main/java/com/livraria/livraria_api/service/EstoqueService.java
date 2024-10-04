package com.livraria.livraria_api.service;

import java.util.List;

import com.livraria.livraria_api.domain.model.Estoque;

public interface EstoqueService extends BaseService<Estoque, Long> {
    List<Estoque> findByLivroId(Long LivroId);
}
