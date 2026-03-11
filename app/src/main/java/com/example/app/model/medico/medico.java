package com.example.app.model.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//classe modelo responsável por criar uma tabela e suas colunas no BD.

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Entity // informa que a classe abaixo é uma entidade ou seja, uma tabela no BD.
@Table(name = "medicos")

public class medico {

    @Id //informa para o BD que a PK é o ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id; //não está vindo do insonia
    private String nome;
    private String email;
    private String crm;

    @Enumerated(EnumType.STRING)
    private Especialidade especialidade;


} 
