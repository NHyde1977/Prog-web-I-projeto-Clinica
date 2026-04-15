# Projeto Médicos - Spring Boot

Este projeto está sendo desenvolvido durante as aulas da faculdade com o objetivo de aprender e praticar o desenvolvimento de aplicações backend utilizando **Spring Boot**.
Novas funcionalidades serão adicionadas conforme o avanço das aulas.

## ANOTATIONS - ANOTAÇÕES
1. Anotações do Spring Web
`@RequestMapping("/medicos")`
=> Define que a classe está mapeada para a url[endpoint] /medicos.

`@RestController`
=> Define que a classe é uma classe controladora no Spring.

`@GetMapping` 
=> Define que o método será somente leitura.

`@PostMapping`
=> Define que o método irá receber dados.

`@PutMapping`
=> Atualiza alguma informação.

`@DeleteMapping`
=> Deleta dados.

`@ResquestBody`
=> é utilizada quando você irá receber dados pelo simulador de requisição [insomnia], e informa que os dados serão enviados no corpo da requisição.

`@Autowired`
=> é utilizado quando você está aplicando a injeção de depêndencia. Ou seja, o Springboot sabe o que a classe(interface) possui de métodos e atributos.

`@Transactional`
=> é utilizado para que o método consiga realizar algum tipo de modelagem(alteração) no BD.

## RELACIONAMENTO DE TABELAS NO SPRINGBOOT
`@OnetoOne` -> Um para Um. (Uma consulta está ligada a um único médico)
`@OnetoMany` -> Um para muitos. (Um médico com várias consultas)
`@ManytoOne` -> Muitos para um. (Muitas consultas para um paciente)
`@ManytoMany` -> Muitos para Muitos. (Muitos pacientes para muitos médicos)

`Chave Primária` (PK) -> é o atributo (campo) que identifica a tabela(objeto) no banco de dados
`Chave Estrangeira` (FK) -> é o atributo PK que está mencionado em uma outra tabela, que por sua vez será um chave extrangeira no banco de dados.

OBS: 
1. Sempre defina o lado "dono" da relação (@JoinCollum) o lado que tem a FK.