package org.javaexercises.fornecedorrepo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Fornecedor {
    private Long Id;
    private String Nome;
    private String Telefone;
    private String Email;
    private String Endereco;
    private String CNPJ;
}
