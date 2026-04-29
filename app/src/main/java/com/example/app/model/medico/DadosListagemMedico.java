package com.example.app.model.medico;

public record DadosListagemMedico(
    Integer id,
    String nome,
    String email,
    String crm,
    Especialidade especialidade
) {
    // Método construtor recebendo o objeto Médico e convertendo para o jason DadasListagemMedico
    public DadosListagemMedico(Medico medico){
        this (medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getEspecialidade());
    }
    // O "this" acima é para chamar o constructor do record, passando do medico para preencher os atributos da classe.
    // O constructor acima é utilizado para converter um objeto tipo medico em um json d dp tipo dadoslistagemMedico, que é
    // o formato que quere,os devolver para a nossa API
}
