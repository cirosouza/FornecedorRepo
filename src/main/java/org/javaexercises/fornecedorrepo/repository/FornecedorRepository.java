package org.javaexercises.fornecedorrepo.repository;

import org.javaexercises.fornecedorrepo.model.Fornecedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FornecedorRepository extends CrudRepository<Fornecedor, Long> {
}
