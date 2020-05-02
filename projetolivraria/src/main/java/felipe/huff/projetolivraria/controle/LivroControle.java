package felipe.huff.projetolivraria.controle;

import felipe.huff.projetolivraria.modelo.Livro;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class LivroControle {

    @GetMapping("/livro")
    public Livro getLivro(){
        Livro livro = new Livro();

        livro.setTitulo("Crepúsculo");
        livro.setEditora("Arqueiro");
        livro.setPaginas(350);

        return livro;
    }


    @GetMapping("/livros")

    public ArrayList<Livro> getListaLivro(){

        Livro livro1 = new Livro();
        livro1.setTitulo("Titanic");
        livro1.setEditora("Cia das Letras");
        livro1.setPaginas(643);



        Livro livro2 = new Livro();
        livro2.setTitulo("Dom Casmurro");
        livro2.setEditora("Cia das Letras");
        livro2.setPaginas(220);


        Livro livro3 = new Livro();
        livro3.setTitulo("Maze Runner");
        livro3.setEditora("Galera");
        livro3.setPaginas(350);


        Livro livro4 = new Livro();
        livro4.setTitulo("Diario de um banana");
        livro4.setEditora("Leya");
        livro4.setPaginas(133);

        ArrayList<Livro> lista = new ArrayList<>();

        lista.add(livro1);
        lista.add(livro2);
        lista.add(livro3);
        lista.add(livro4);

        return lista;
    }
}//fim



