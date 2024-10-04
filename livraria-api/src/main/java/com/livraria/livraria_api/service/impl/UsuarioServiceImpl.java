package com.livraria.livraria_api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.livraria.livraria_api.domain.model.Usuario;
import com.livraria.livraria_api.domain.repository.UsuarioRepository;
import com.livraria.livraria_api.service.UsuarioService;


@Service
public class UsuarioServiceImpl extends  BaseServiceImpl<Usuario, Long>  implements UsuarioService{
    private final UsuarioRepository usuarioRepository;

    //constructor
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        super(usuarioRepository);
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
     return  usuarioRepository.findByEmail(email);
    }

    @Override
    public List<Usuario> findByNome(String nome) {
       return usuarioRepository.findByNome(nome);
    }
}
