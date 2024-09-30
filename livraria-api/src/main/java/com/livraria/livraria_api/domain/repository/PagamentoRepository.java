package com.livraria.livraria_api.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.livraria_api.domain.model.Pagamento;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long>{
    
}
