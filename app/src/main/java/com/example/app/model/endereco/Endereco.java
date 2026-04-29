package com.example.app.model.endereco;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable

public class Endereco {
    private String logradouro;
    private String bairro;
    private String cep;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco (DadosCadastroEndereco dados) {
        this.logradouro = dados.logradouro();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.complemento = dados.complemento();
        this.cidade = dados.cidade();
        this.uf = dados.uf();
    }

    // Método para atualizar as informações do endereço, recebendo um objeto do tipo
    //dadoscadastroendereco e atualizando os atributos do endereço com os dados recebidos
    public void atualizarInformacoes(DadosCadastroEndereco dados) {
        if (dados.logradouro() != null) {
            this.logradouro = dados.logradouro();
        }
        if (dados.bairro() != null) {
            this.bairro = dados.bairro();
        }
        if (dados.cep() != null) {
            this.cep = dados.cep();
        }
        if (dados.complemento() != null) {
            this.complemento = dados.complemento();
        }
        if (dados.cidade() != null) {
            this.cidade = dados.cidade();
        }
        if (dados.uf() != null) {
            this.uf = dados.uf();
        }
    }

}