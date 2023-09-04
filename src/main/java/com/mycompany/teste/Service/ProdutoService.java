/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.teste.Service;
import com.mycompany.teste.DataSourseModel.produto;
import com.mycompany.teste.Respository.RepositoryProduto;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author julianob
 */
@Service
public class ProdutoService {
    @Autowired
    private RepositoryProduto  RepositoryProduto;
    public void buscarPorId(){
    Optional<produto> p = RepositoryProduto.findById(1L); // Usar 1L em vez de 1
    p.ifPresent(System.out::println);
}
    
    public void cadastro(produto produto){
        RepositoryProduto.saveAndFlush(produto);
    }
}
