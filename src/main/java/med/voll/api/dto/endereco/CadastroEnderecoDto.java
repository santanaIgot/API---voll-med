package med.voll.api.dto.endereco;

public record CadastroEnderecoDto(String logradouro,String bairro, String cep, String cidade,
                                  String uf, String complemento, String numero) {
}
