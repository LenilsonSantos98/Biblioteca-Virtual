package com.livraria.livraria_api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.livraria.livraria_api.domain.model.Pagamento;
import com.livraria.livraria_api.domain.repository.PagamentoRepository;
import com.livraria.livraria_api.service.PagamentoService;

@Service
public class PagamentoServiceImpl extends BaseServiceImpl<Pagamento, Long> implements PagamentoService {
    private final PagamentoRepository pagamentoRepository;

    //constructor
    public PagamentoServiceImpl(PagamentoRepository pagamentoRepository){
        super(pagamentoRepository);
        this.pagamentoRepository = pagamentoRepository;
    }

    @Override
    public List<Pagamento> findByPedidoId(Long pedidoId) {
       
        return pagamentoRepository.findByPedidoId(pedidoId);
    }

    @Override
    public List<Pagamento> findByStatusPagamento(String status) {
        
        return pagamentoRepository.findByStatusPagamento(status);
    }

    
}
