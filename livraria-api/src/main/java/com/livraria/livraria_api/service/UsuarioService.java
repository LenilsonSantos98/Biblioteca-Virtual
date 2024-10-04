package com.livraria.livraria_api.service;

import java.util.List;
import java.util.Optional;

import com.livraria.livraria_api.domain.model.Usuario;

public interface UsuarioService extends BaseService<Usuario, Long> {
    Optional<Usuario> findByEmail (String email);
    List<Usuario> findByNome(String nome);
}
