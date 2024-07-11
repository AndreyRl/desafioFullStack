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
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idEmpresa")
    private Long idEmpresa;

    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "nomeEmpresa")
    private String nomeEmpresa;

    @Column(name = "cep")
    private String cep;

    @OneToMany(mappedBy = "empresa")
    private Set<Contrato> contratos = new HashSet<>();
}