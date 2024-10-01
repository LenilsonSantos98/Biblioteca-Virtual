package com.livraria.livraria_api.service;

import java.util.List;
import java.util.Optional;

// Base genérica
public interface BaseService <T, ID>{
    T create (T entity);
    T update(ID id, T entity);
    Optional<T> findById(ID id);
    List<T> findAll();
    void delete(ID id);
}
