package com.mycompany.teste.DataSourseModel;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="conserto")
public class Conserto implements Serializable
 {
    @Id
    private int id;
    private  LocalDate  data;

    @ManyToOne
    @JoinColumn(name = "Produto_id") // Nome da coluna na tabela 'conserto' que faz referência à tabela 'produto'
    private produto produto;
    
    public Conserto()
    {
        // Construtor vazio necessário para JPA
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public produto getProduto() {
        return produto;
    }

    public void setProduto(produto produto) {
        this.produto = produto;
    }
}
