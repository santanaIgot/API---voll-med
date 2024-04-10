package med.voll.api.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter@Setter
@NoArgsConstructor
@Entity
@Table(name = "atividade_tb_endereco")
public class Endereco {
    @Id
    @GeneratedValue
    @Column(name = "logradouro", nullable = false)
    private String logradouro;
    @Column(name = "bairro", nullable = false)
    private String bairro;
    @Column(name = "cep", nullable = false,length = 10)
    private String cep;
    @Column(name = "cidade", nullable = false)
    private String cidade;
    @Column(name = "uf", nullable = false)
    private String uf;
    @Column(name = "complemento", nullable = false)
    private String complemento;
    @Column(name = "numero", nullable = false)
    private String numero;
}
