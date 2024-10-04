package com.livraria.livraria_api.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.livraria.livraria_api.domain.model.Endereco;
import com.livraria.livraria_api.domain.repository.EnderecoRepository;
import com.livraria.livraria_api.service.EnderecoService;

@Service
public class EnderecoServiceImpl extends  BaseServiceImpl<Endereco, Long> implements EnderecoService {
    private final EnderecoRepository enderecoRepository;

    //constructor
    public EnderecoServiceImpl(EnderecoRepository enderecoRepository){
        super(enderecoRepository);
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public List<Endereco> findByUsuarioId(Long usuarioId) {
        
        return enderecoRepository.findByUsuarioId(usuarioId);
    }

    
}
