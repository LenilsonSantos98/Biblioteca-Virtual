package com.livraria.livraria_api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.livraria_api.domain.model.Endereco;


@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {

    public List<Endereco> findByUsuarioId(Long usuarioId);
    
}
