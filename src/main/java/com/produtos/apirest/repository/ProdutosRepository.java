package com.produtos.apirest.repository;

import com.produtos.apirest.models.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
    Produtos findById(long id);
}
