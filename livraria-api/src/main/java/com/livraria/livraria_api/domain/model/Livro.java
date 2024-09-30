package com.livraria.livraria_api.domain.model;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    
    private String titulo;
    private String sinopse;
    private String isbn;
    private BigDecimal preco;

    @OneToMany(mappedBy = "livro", cascade = CascadeType.ALL )
    private List<Estoque> estoques;

    @ManyToOne
    @JoinColumn(name = "editora_id", nullable= false)
    private Editora editora;
    
    @ManyToMany
    @JoinTable(
        name = "livro_autor",
        joinColumns = @JoinColumn (name = "livro_id"),
        inverseJoinColumns = @JoinColumn(name = "autor_id")
        )
    private List<Autor> autores;
        
    @ManyToOne
    @JoinColumn(name = "categoria_id", nullable= false)
    private Categoria categoria;

    //constructor 
    public Livro(){}
    
    public Livro(Long id, String titulo, String sinopse, String isbn, BigDecimal preco, List<Estoque> estoques,
            Editora editora, List<Autor> autores, Categoria categoria) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.isbn = isbn;
        this.preco = preco;
        this.estoques = estoques;
        this.editora = editora;
        this.autores = autores;
        this.categoria = categoria;
    }

    //getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    public List<Estoque> getEstoques() {
        return estoques;
    }

    public void setEstoques(List<Estoque> estoques) {
        this.estoques = estoques;
    }

    

   
}
