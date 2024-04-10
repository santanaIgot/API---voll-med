package med.voll.api.dto.medico;

import med.voll.api.dto.endereco.DadosEnderecoDto;
import med.voll.api.model.Especialidade;
import med.voll.api.model.Medico;

public record DetalhesMedicosDto(String nome, String email, String crm, Especialidade especialidade) {
    public DetalhesMedicosDto(Medico dto){
        this(dto.getNome(), dto.getEmail(), dto.getCrm(),dto.getEspecialidade());
    }
}
