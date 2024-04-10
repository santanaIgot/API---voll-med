package med.voll.api.controller;


import med.voll.api.dto.medico.DadosCadastroMedicoDto;
import med.voll.api.dto.medico.DetalhesMedicosDto;
import med.voll.api.model.Medico;
import med.voll.api.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public ResponseEntity<DetalhesMedicosDto> cadastrar(@RequestBody DadosCadastroMedicoDto dto, UriComponentsBuilder uriBuilder){
        var medico = new Medico(dto);
        medicoRepository.save(medico);
        var uri = uriBuilder.path("/produtos/{id}").buildAndExpand(medico.getCodigoMedico()).toUri();

        return ResponseEntity.created(uri).body(new DetalhesMedicosDto(medico));
    }
}
