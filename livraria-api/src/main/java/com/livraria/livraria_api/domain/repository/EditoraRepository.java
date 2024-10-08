package com.livraria.livraria_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.livraria_api.domain.model.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{
    
}
