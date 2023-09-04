/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.Resourses.Model;

import com.mycompany.teste.DataSourseModel.produto;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author julianob
 */
public class ConsertoResourse implements Serializable{
    private static final long serialVersionUID = 6030862910379069667L; 
    
    @JsonProperty("id")
    private String id;
 
    @JsonProperty("Data")    
    private String Data;
    
     @JsonProperty("Produto_id")
    private produto Produto_id;

    public ConsertoResourse(String id, String Data, produto Produto_id) {
        this.id = id;
        this.Data = Data;
        this.Produto_id = Produto_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public produto getProduto_id() {
        return Produto_id;
    }

    public void setProduto_id(produto Produto_id) {
        this.Produto_id = Produto_id;
    }
     
     
}
