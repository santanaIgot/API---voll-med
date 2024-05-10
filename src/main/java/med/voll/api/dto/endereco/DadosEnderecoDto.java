package med.voll.api.dto.endereco;

import med.voll.api.model.Endereco;

public record DadosEnderecoDto(String logradouro, String bairro, String cep,
                               String cidade, String uf, String complemento, String numero) {

    public DadosEnderecoDto(Endereco endereco0){
        this(endereco0.getLogradouro(), endereco0.getBairro(), endereco0.getCep(),
                endereco0.getCidade(), endereco0.getUf(), endereco0.getComplemento(),
                endereco0.getNumero());
    }

}
