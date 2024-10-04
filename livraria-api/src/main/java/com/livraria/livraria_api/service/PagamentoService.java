package com.livraria.livraria_api.service;

import java.util.List;

import com.livraria.livraria_api.domain.model.Pagamento;

public interface PagamentoService extends BaseService<Pagamento, Long> {
    List<Pagamento>findByStatusPagamento(String status);
    List<Pagamento>findByPedidoId(Long pedidoId);
}
