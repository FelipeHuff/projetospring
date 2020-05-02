package felipe.huff.projetolivraria.modelo;

import lombok.*;

/**
 * @author Felipe Huff
 * @since 01/05/2020 19h.
 * @version livro 1.0
 */

@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Livro {

    @Getter @Setter
    private String titulo;

    @Getter @Setter
    private String editora;

    @Getter @Setter
    private int paginas;

}
