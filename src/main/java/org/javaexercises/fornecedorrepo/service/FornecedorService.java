package org.javaexercises.fornecedorrepo.service;

import lombok.RequiredArgsConstructor;
import org.javaexercises.fornecedorrepo.model.Fornecedor;
import org.javaexercises.fornecedorrepo.repository.FornecedorRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class FornecedorService {

    private final FornecedorRepository fornecedorRepository;

    public Iterable<Fornecedor> findAll() {
        return fornecedorRepository.findAll();
    }

    public Optional<Fornecedor> findById(Long id) {
        return fornecedorRepository.findById(id);
    }

    public Fornecedor save(Fornecedor fornecedor) {
        return fornecedorRepository.save(fornecedor);
    }

    public void delete(Fornecedor fornecedor) {
        fornecedorRepository.delete(fornecedor);
    }
}
