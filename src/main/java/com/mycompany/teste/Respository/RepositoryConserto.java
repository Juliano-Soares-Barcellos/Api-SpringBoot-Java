package com.mycompany.teste.Respository;

import com.mycompany.teste.DataSourseModel.Conserto;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author julianob
 */
public interface RepositoryConserto extends JpaRepository<Conserto, Integer> {
   public Optional<Conserto> findById(long idProduto);
}
