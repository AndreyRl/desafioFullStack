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
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idFornecedor")
    private Long idFornecedor;

    @Column(name = "cnpj_cpf")
    private String cnpj_cpf;

    @Column(name = "nome")
    private String nome;

    @Column(name = "email")
    private Stirng email;

    @Column(name = "cep")
    private String cep;

    @OneToMany(mappedBy = "fornecedor")
    private Set<Contrato> contratos = new HashSet<>();

}