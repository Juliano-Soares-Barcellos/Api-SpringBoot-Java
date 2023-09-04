package com.mycompany.teste.Controller;

import com.mycompany.teste.Service.ProdutoConsertoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(value = "/Api")
public class ProdutoConsertoController {

    private final ProdutoConsertoService produtoConsertoService;

    public ProdutoConsertoController(ProdutoConsertoService produtoConsertoService) {
        this.produtoConsertoService = produtoConsertoService;
    }

    @GetMapping("/produtos")
    public List<Object[]> getProdutosComDatasConserto() {
        System.out.println("Testando");
        return produtoConsertoService.getProdutosComDatasConserto();
    }
}
