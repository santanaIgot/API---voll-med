package med.voll.api.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import med.voll.api.dto.medico.DadosCadastroMedicoDto;

@Getter@Setter
@NoArgsConstructor
@Entity
@Table(name = "atividade_tb_medico")
public class Medico {
    @Id
    @GeneratedValue
    @Column(name = "cd_medico",nullable = false)
    private Long codigoMedico;
    @Column(name = "nm_medico", nullable = false, length = 100)
    private String nome;
    @Column(name = "nm_email", nullable = false)
    private String email;
    @Column(name = "nr_crm", nullable = false)
    private String crm;
    @Column(name = "tp_especialidade", nullable = false)
    private Especialidade especialidade;

    public Medico(DadosCadastroMedicoDto dto ){
        nome = dto.nome();
        email = dto.email();
        crm = dto.crm();
        especialidade = dto.especialidade();
    }

}
