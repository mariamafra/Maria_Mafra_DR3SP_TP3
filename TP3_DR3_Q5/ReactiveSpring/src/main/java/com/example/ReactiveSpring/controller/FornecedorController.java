package com.example.ReactiveSpring.controller;


import com.example.ReactiveSpring.model.Fornecedor;
import com.example.ReactiveSpring.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/fornecedores")
public class FornecedorController {
    @Autowired
    private FornecedorService fornecedorService;

    @PostMapping
    public ResponseEntity<Fornecedor> createFornecedor(@RequestBody Fornecedor fornecedor) {
        return ResponseEntity.ok(fornecedorService.createFornecedor(fornecedor));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Fornecedor> getFornecedorById(@PathVariable Long id) {
        Optional<Fornecedor> fornecedor = fornecedorService.getFornecedorById(id);
        return fornecedor.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<Iterable<Fornecedor>> getAllFornecedores() {
        return ResponseEntity.ok(fornecedorService.getAllFornecedores());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Fornecedor> updateFornecedor(@PathVariable Long id, @RequestBody Fornecedor fornecedor) {
        fornecedor.setId(id);
        return ResponseEntity.ok(fornecedorService.updateFornecedor(fornecedor));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFornecedor(@PathVariable Long id) {
        fornecedorService.deleteFornecedor(id);
        return ResponseEntity.noContent().build();
    }
}
