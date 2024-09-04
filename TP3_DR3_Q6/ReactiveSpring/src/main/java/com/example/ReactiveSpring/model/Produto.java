package com.example.ReactiveSpring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("produtos")
public class Produto {
    @Id
//    @Column("produtoId")
    private Long id;
//    @Column("produtoNome")
    private String nome;
//    @Column("produtoPreco")
    private Double preco;
}
