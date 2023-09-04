package com.mycompany.teste.Service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProdutoConsertoService {

    private final EntityManager entityManager;

    public ProdutoConsertoService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Object[]> getProdutosComDatasConserto() {
        String sql = "SELECT p.id, p.Nome, p.Numero, " +
                     "GROUP_CONCAT(c.data SEPARATOR ', ') AS datasConserto " +
                     "FROM produto p " +
                     "INNER JOIN Conserto c ON p.id = c.produto_id " +
                     "GROUP BY  p.Numero ORDER BY p.Numero desc;";

        Query query = entityManager.createNativeQuery(sql);

        return query.getResultList();
    }
}
