package com.livraria.livraria_api.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.livraria_api.domain.model.Livro;

@Repository
public interface  LivroRepository extends JpaRepository<Livro, Long> {

    public boolean existsByIsbn(String isbn);
    List<Livro> findByTituloContaining(String titulo);
}
