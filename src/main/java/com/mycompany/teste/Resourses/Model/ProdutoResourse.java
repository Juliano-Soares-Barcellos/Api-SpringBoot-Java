/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.Resourses.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;

/**
 *
 * @author julianob
 */
public class ProdutoResourse implements Serializable {

    private static final long serialVersionUID = 6030862910379069667L;
    @JsonProperty("Nome")
    private String nome;
    @JsonProperty("Numero")
    private String numero;
    @JsonProperty("quantidade_conserto")
    private int QuantidadeConserto;

    public ProdutoResourse(String Nome, String Numero, int QuantidadeConserto) {
        this.nome = Nome;
        this.numero = Numero;
        this.QuantidadeConserto = QuantidadeConserto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String Nome) {
        this.nome = Nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String Numero) {
        this.numero = Numero;
    }

    public int getQuantidadeConserto() {
        return QuantidadeConserto;
    }

    public void setQuantidadeConserto(int QuantidadeConserto) {
        this.QuantidadeConserto = QuantidadeConserto;
    }

    @Override
    public String toString() {
        return "ProdutoResourse{" + "nome=" + nome + ", numero=" + numero + ", quantidadeConserto=" + QuantidadeConserto + '}';
    }
}
