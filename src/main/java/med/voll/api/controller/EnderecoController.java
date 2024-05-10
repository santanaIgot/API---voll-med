package med.voll.api.controller;

import med.voll.api.dto.endereco.CadastroEnderecoDto;
import med.voll.api.dto.endereco.DadosEnderecoDto;
import med.voll.api.model.Endereco;
import med.voll.api.repository.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @PostMapping
    public ResponseEntity<DadosEnderecoDto> post(@RequestBody CadastroEnderecoDto dto,
                                                 UriComponentsBuilder uriBuilder){
        var endereco = new Endereco(dto);
    }
}
