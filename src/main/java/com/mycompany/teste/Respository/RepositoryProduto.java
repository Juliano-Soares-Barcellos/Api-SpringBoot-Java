/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.teste.Respository;

import com.mycompany.teste.DataSourseModel.produto;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author julianob
 */
public interface RepositoryProduto extends JpaRepository<produto, Integer> {

    public Optional<produto> findById(long idProduto);
     @Query("SELECT p FROM produto p WHERE p.Numero = :numero")
   produto returnBynumero(@Param("numero") String Numero);



//    @Query("SELECT p.id, p.Nome, p.Numero, c.data FROM produto p " +
//           "INNER JOIN conserto c ON p.id = c.produtoId " +
//           "ORDER BY p.numero, c.data ASC")
//    List<Object[]> findProdutosComDatasConserto();
}



