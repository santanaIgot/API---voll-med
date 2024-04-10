package med.voll.api.dto.medico;

import med.voll.api.dto.endereco.DadosEnderecoDto;
import med.voll.api.model.Especialidade;
import med.voll.api.model.Medico;

public record DadosCadastroMedicoDto(String nome, String email, String crm, Especialidade especialidade) {

}
