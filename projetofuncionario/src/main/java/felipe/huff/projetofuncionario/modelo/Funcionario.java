package felipe.huff.projetofuncionario.modelo;


import lombok.*;

/**
 * @author Felipe Huff
 * @since 01/05/2020 18h.
 * @version funcionario 1.0
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Funcionario {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private String email;

    @Getter @Setter
    private double salario;

}
