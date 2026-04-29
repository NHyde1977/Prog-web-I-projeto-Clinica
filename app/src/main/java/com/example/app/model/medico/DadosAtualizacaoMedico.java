package com.example.app.model.medico;

import com.example.app.model.endereco.DadosCadastroEndereco;
//Classe responsável por receber os dados de atualização do Médido, utilizano o recurso record.
// DadosCadastroEndereco é um DTO, então como o enderço pode ser alterado em qualquer campo,
// estamos reusando (reuso) para a alteração do Médico.
public record DadosAtualizacaoMedico(Integer id, String nome, String email, DadosCadastroEndereco endereco){
    
}
