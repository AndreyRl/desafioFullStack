import lombok.*;

import javax.persistence.*;
@Data
@Getter
@Setter
@Entity
@Table(name = "usuario")
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Usuario {
    @id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @column(name = "idUsuario")
    private Long idUsuario;
    @Column(name = "matricula")
    private Long matricula;
    @Column(name = "nome")
    private String nome;
    @Column(name = "setor")
    private String setor;
    @Column(name = "email")
    private String email;
    @Column(name = "senha")
    private String senha;
}