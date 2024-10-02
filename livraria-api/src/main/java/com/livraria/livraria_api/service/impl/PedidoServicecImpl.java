package com.livraria.livraria_api.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.livraria.livraria_api.domain.model.Pedido;
import com.livraria.livraria_api.domain.repository.PedidoRepository;
import com.livraria.livraria_api.service.PedidoService;

@Service
public class PedidoServicecImpl extends BaseServiceImpl<Pedido, Long> implements PedidoService {
    private final PedidoRepository pedidoRepository;

    public PedidoServicecImpl(PedidoRepository pedidoRepository) {
        super(pedidoRepository);
        this.pedidoRepository = pedidoRepository;
    }

    @Override
    public List<Pedido> findByUsuarioId(Long usuarioId){
        return pedidoRepository.findByUsuarioId(usuarioId);
    }

    @Override
    public List<Pedido> findByDataPedidoBetween(LocalDate startDate, LocalDate endDate) {
        
        return pedidoRepository.findByDataPedidoBetween(startDate, endDate);
    }

    @Override
    public List<Pedido> findByStatus(String status) {
        
        return pedidoRepository.findByStatus(status);
    }
   
    
    
}
