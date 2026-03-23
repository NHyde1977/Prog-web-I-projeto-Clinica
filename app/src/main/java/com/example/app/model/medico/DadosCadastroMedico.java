package com.example.app.model.medico;

//import com.example.app.model.endereco.DadosCadastroEndereco;

public record DadosCadastroMedico(
    String nome, 
    String email, 
    String crm,
    Especialidade especialidade
 //   DadosCadastroEndereco endereco
 ) {
    
}
