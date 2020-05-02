package felipe.huff.projetoaluno.modelo;
import lombok.*;

/**
 * @author Felipe Huff
 * @since 01/05/2020 16h.
 * @version aluno 1.0
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Aluno {

    @Getter @Setter
    private String nome;

    @Getter @Setter
    private int idade;

    @Getter @Setter
    private String email;

}
