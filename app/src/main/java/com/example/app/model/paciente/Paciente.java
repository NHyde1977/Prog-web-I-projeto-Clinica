package com.example.app.model.paciente;

import com.example.app.model.endereco.Endereco;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity // informa que a classe abaixo é uma entidade ou seja, uma tabela no BD.
@Table(name = "pacientes")

public class Paciente {
    
    @Id //informa para o BD que a PK é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Embedded // Utilizada na classe pai, associa uma entidade a uma tabela auxiliar
    private Endereco endereco;

    private Integer id; //não está vindo do insonia
    private String nome;
    private String email;
    private String telefone;

    public Paciente(DadosCadastroPaciente dados){
        this.nome = dados.nome();
        this.email = dados.email();
        this.telefone = dados.telefone();
        
    }
}