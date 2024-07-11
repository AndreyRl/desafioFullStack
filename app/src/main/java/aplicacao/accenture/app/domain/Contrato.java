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
public class Contrato {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idContrato")
    private Long idContrato;

    @Column(name = "dtContrato")
    private Date dtContrato;
    @ManyToMany
    @JoinColumn(name = "fkEmpresa")
    private Long fkEmpresa;
    @ManyToMany
    @JoinColumn(name = "fkFornecedor")
    private Long fkFornecedor;

}