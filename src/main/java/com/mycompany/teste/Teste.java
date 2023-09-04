/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.teste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 *
 * @author julianob
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.mycompany.teste") // Adjust the package name accordingly
public class Teste {
    public static void main(String[] args) {
        System.setProperty("server.port", "7019");
        SpringApplication.run(Teste.class, args);
    }
}
