package com.example.app.model.medico;

import com.example.app.model.endereco.Endereco;

import jakarta.persistence.*;
import lombok.*;

//classe modelo responsável por criar uma tabela e suas colunas no BD.

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity // informa que a classe abaixo é uma entidade ou seja, uma tabela no BD.
@Table(name = "medicos")

public class Medico {

    @Id //informa para o BD que a PK é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id; //não está vindo do insonia
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;

    @Embedded // Utilizada na classe pai, associa uma entidade a uma tabela auxiliar
    private Endereco endereco;

        // Constructor com o recebimento dos dados,
    // convertendo para o objeto.
    public Medico(DadosCadastroMedico dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.crm = dados.crm();
        this.especialidade = dados.especialidade();
        this.endereco = new Endereco(dados.endereco());
    }

    //Método para verificar a atualização do médico, recebendo um objeto do tipo
    //DadosAtualizacaoMedico e atualizando os atributos do médico com os dados
    // recebidos na requisição
    public void atualizarInformacoes(DadosAtualizacaoMedico dados) {
        //Verifica se o nome recebido é diferente de null, ou seja, se o nome foi enviado
        // na requisição da atualização (put), e se for diferente de null, atualiza o nome do
        //médico com o nome recebido.
        if (dados.nome()!= null) {
            this.nome = dados.nome();
        }
        if (dados.email()!= null) {
            this.email = dados.email();
        }
        if (dados.endereco()!= null) {
            this.endereco.atualizarInformacoes(dados.endereco());
        }
    }

} 
