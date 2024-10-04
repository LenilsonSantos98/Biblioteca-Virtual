package com.livraria.livraria_api.service;

import java.util.List;

import com.livraria.livraria_api.domain.model.Endereco;

public interface EnderecoService extends BaseService<Endereco, Long> {
    List<Endereco> findByUsuarioId(Long usuarioId);
}
