package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.example.app.model.medico.DadosAtualizacaoMedico;
import com.example.app.model.medico.DadosCadastroMedico;
import com.example.app.model.medico.DadosListagemMedico;
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

    @GetMapping("todos") //springweb informa que o método abaixo é do tipo GET (buscar/ler)
    public List<Medico> listartodos(){
        return repository.findAll();
    }

    @GetMapping("listar")
    public List<DadosListagemMedico> listar(){
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
        //findall()> método que retorna uma lista de objetos do tipo dadosListagemMedico
        //stream()> método utilizado para transformar a lista em um fluxo de dados, permitindo aplicar operações de transformação
        //map(DadosListagemMedico::new)> método utilizado para converter cada objeto do tipo médico em um jason DadosListagemMedico, utilizando
        // o constructor que criamos em DadisListagemMedico
        //toList()> Método utilizado para coletar os resultados em uma nova lista de tipo DadosListagemMedico, que é o formato que queremos retornar
        // para a api
    }


    @GetMapping
    public Page<DadosListagemMedico> listarPorPagina(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemMedico::new);
        //return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }

    @PutMapping
    public void atualizar(@RequestBody DadosAtualizacaoMedico dados){
        var medico = repository.getReferenceById(dados.id());
        //var é uma palavra reservada em java que permite declara uma variável sem
        //especificar o tipo dela. O tipo da variável é inferido pelo compilador com
        //base no valor que foi atribuído a ela.
        medico.atualizarInformacoes(dados);
    }
}

