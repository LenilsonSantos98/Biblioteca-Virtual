package com.livraria.livraria_api.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Pagamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String statusPagamento;

    @ManyToOne
    @JoinColumn(name= "metodo_pagamento_id")
    private MetodoPagamento metodoPagamento;

    //constructors

    public Pagamento (){}
    
    public Pagamento(Long id, MetodoPagamento metodoPagamento, String statusPagamento) {
        this.id = id;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
    }

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatusPagamento() {
        return statusPagamento;
    }

    public void setStatusPagamento(String statusPagamento) {
        this.statusPagamento = statusPagamento;
    }

    public MetodoPagamento getMetodoPagamento() {
        return metodoPagamento;
    }

    public void setMetodoPagamento(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
}
