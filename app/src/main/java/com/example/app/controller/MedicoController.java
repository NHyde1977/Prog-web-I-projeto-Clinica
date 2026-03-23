package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.app.model.medico.DadosCadastroMedico;
import com.example.app.model.medico.Medico;
import com.example.app.model.medico.MedicoRepository;


@RestController // classe cotroladora de requisições: get, post, put e delete
@RequestMapping("medicos") // cria caminho (endpoint) para a classe MedicoController
public class MedicoController {

    @Autowired
    private MedicoRepository repository;
    
    @PostMapping // informa que o método abaixo é do tipo post.
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico (dados));
    }
}

//teste