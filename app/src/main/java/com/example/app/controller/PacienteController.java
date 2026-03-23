package com.example.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.app.model.paciente.DadosCadastroPaciente;
import com.example.app.model.paciente.Paciente;
import com.example.app.model.paciente.PacienteRepository;


@RestController
@RequestMapping("pacientes")
public class PacienteController {
    
    @Autowired
    private PacienteRepository repository;
    
    @PostMapping // informa que o método abaixo é do tipo post.
    public void cadastrar(@RequestBody DadosCadastroPaciente dados) {
        repository.save(new Paciente (dados));
    }
}