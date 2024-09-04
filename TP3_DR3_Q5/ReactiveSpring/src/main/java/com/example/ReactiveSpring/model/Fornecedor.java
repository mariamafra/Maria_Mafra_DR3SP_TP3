package com.example.ReactiveSpring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table("FORNECEDORES")
public class Fornecedor {
    @Id
    private Long id;
    private String nome;
    private String telefone;
}
