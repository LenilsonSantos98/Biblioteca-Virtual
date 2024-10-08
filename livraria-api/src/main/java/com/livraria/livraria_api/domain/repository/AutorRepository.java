package com.livraria.livraria_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.livraria_api.domain.model.Autor;

@Repository
public interface  AutorRepository extends JpaRepository<Autor, Long>{
    
}
