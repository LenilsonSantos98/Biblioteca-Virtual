package com.livraria.livraria_api.service.impl;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.livraria.livraria_api.service.BaseService;

@Service
public abstract class BaseServiceImpl <T, ID> implements BaseService<T, ID> {
    protected JpaRepository<T,ID> repository;

    public BaseServiceImpl(JpaRepository<T, ID> repository){
        this.repository = repository;
    }

    @Override
    public T create(T entity) {
        
        return repository.save(entity);
    }

    @Override
    public void delete(ID id) {
       repository.deleteById(id);
        
    }

    @Override
    public List<T> findAll() {
        
        return repository.findAll();
    }

    @Override
    public Optional<T> findById(ID id) {
        
        return repository.findById(id);
    }

    @Override
    public T update(ID id, T entity) {
        if(!repository.existsById(id)){
            throw new NoSuchElementException("Entidade não encontrada.");
        }
        return repository.save(entity);
    }   

    
}
