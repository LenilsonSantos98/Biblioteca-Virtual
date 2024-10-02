package com.livraria.livraria_api.service;

import java.time.LocalDate;
import java.util.List;

import com.livraria.livraria_api.domain.model.Pedido;

public interface PedidoService extends BaseService<Pedido, Long> {
    List<Pedido> findByUsuarioId(Long usuarioId);
    List<Pedido> findByStatus(String status);
    List<Pedido> findByDataPedidoBetween(LocalDate startDate, LocalDate endDate);

}
