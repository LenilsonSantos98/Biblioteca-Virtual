package com.livraria.livraria_api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.livraria.livraria_api.domain.model.Estoque;
import com.livraria.livraria_api.domain.repository.EstoqueRepository;
import com.livraria.livraria_api.service.EstoqueService;

@Service
public class EstoqueServiceImpl extends BaseServiceImpl<Estoque, Long> implements EstoqueService {
    private final EstoqueRepository estoqueRepository;

    public EstoqueServiceImpl(EstoqueRepository estoqueRepository){
        super(estoqueRepository);
        this.estoqueRepository = estoqueRepository;
    }

    @Override
    public List<Estoque> findByLivroId(Long LivroId) {
       
        return estoqueRepository.findByLivroId(LivroId);
    }

    
}
