package com.livraria.livraria_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.livraria_api.domain.model.Categoria;

@Repository
public interface CategoriaRepository extends  JpaRepository<Categoria, Long>{
    
}
