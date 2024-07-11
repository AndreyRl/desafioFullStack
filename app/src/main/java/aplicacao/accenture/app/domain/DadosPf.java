import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DadosPf {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idDadosPf")
    private Long idDadosPf;

    @Column(name = "registroGeral")
    private String registroGeral;

    @Column(name = "dtNascimento")
    private Date dtNascimento;
    @OneToOne
    @JoinColumn(name = "fkFornecedor")
    private Long fkFornecedor;
}