package com.example.app.model.medico;

import com.example.app.model.endereco.DadosCadastroEndereco;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

//import com.example.app.model.endereco.DadosCadastroEndereco;

public record DadosCadastroMedico(

    @NotBlank
    String nome,

    @Email
    @NotBlank
    String email,

    String crm,

    @NotNull
    Especialidade especialidade,

    @NotNull @Valid
    DadosCadastroEndereco endereco
 ) {
    
}
