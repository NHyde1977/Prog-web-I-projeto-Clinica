package com.example.app.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.app.model.paciente.DadosCadastroPaciente;

@RestController // classe cotroladora de requisições: get, post, put e delete
@RequestMapping("medicos") // cria caminho (endpoint) para a classe MedicoController
public class MedicoController {
    
    @PostMapping // informa que o método abaixo é do tipo post.
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        System.out.println(dados);
    }
}