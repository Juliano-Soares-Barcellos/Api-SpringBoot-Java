package com.mycompany.teste.Controller;

import com.mycompany.teste.DataSourseModel.Conserto;
import com.mycompany.teste.DataSourseModel.produto;
import com.mycompany.teste.Respository.RepositoryConserto;
import com.mycompany.teste.Respository.RepositoryProduto;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Api")
public class ProdutoController {

    @Autowired
    private RepositoryProduto repositoryProduto;

    @Autowired
    private RepositoryConserto repositoryConserto;

    @GetMapping(path = "/Api/buscarProduto/Juliano/{id}")
    public Optional<produto> buscarPorId(@PathVariable(name = "id", required = true) int idProduto) {
        return repositoryProduto.findById(idProduto);
    }

    @GetMapping(path = "/buscarProdutoPorId-teste-Juliano")
    public List<produto> buscarTodosProdutos() {
        return repositoryProduto.findAll();
    }

    @PostMapping(path = "/salvarProduto")
    public void SalvarProduto(@RequestBody produto Produto) {
        produto produto = new produto();
        Conserto conserto = new Conserto();
        produto = repositoryProduto.returnBynumero(Produto.getNumero());
       
        if(produto==null){
        produto = repositoryProduto.saveAndFlush(Produto);
        conserto.setProduto(produto);
        LocalDate data = LocalDate.now();
        conserto.setData(data);
        repositoryConserto.save(conserto);
        }else{
           conserto.setProduto(produto);
        LocalDate data = LocalDate.now();
        conserto.setData(data);
        repositoryConserto.save(conserto); 
        }
    }
   
}







