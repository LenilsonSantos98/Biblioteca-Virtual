package com.livraria.livraria_api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.livraria_api.domain.model.Estoque;

@Repository
public interface EstoqueRepository extends  JpaRepository<Estoque, Long> {

    public List<Estoque> findByLivroId(Long LivroId);
    
}
