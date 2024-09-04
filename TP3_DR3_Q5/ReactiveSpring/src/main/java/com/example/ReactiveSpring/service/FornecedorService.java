package com.example.ReactiveSpring.service;

import com.example.ReactiveSpring.model.Fornecedor;
import com.example.ReactiveSpring.repository.FornecedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FornecedorService {
    @Autowired
    private FornecedorRepository fornecedorRepository;

    public Fornecedor createFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public Optional<Fornecedor> getFornecedorById(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Iterable<Fornecedor> getAllFornecedores() {
        return fornecedorRepository.findAll();
    }

    public Fornecedor updateFornecedor(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public void deleteFornecedor(Long id) {
        fornecedorRepository.deleteById(id);
    }
}
