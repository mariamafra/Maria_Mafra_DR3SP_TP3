package com.example.ReactiveSpring.repository;

import com.example.ReactiveSpring.model.Produto;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends R2dbcRepository<Produto, Long> {
}
