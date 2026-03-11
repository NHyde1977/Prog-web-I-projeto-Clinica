package com.example.app.model.endereco;

public record DadosCadastroEndereco(
    String logradouro,
    String bairro,
    int cep,
    String complemento,
    String uf
) {
    
}
