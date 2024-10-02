package com.livraria.livraria_api.domain.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.livraria.livraria_api.domain.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

    public List<Pedido> findByUsuarioId(Long usuarioId);

    public List<Pedido> findByStatus(String status);

    public List<Pedido> findByDataPedidoBetween(LocalDate startDate, LocalDate endDate);
    
}
