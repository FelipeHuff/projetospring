package felipe.huff.projetoaluno.controle;


import felipe.huff.projetoaluno.modelo.Aluno;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AlunoControle {

    @GetMapping("/aluno")
    public Aluno getAluno(){
        Aluno aluno = new Aluno();

        aluno.setNome("Marcos Santos");
        aluno.setIdade(15);
        aluno.setEmail("marcos@hotmail.com");

        return aluno;
    }


    @GetMapping("/listaalunos")

    public ArrayList<Aluno> getListaAlunos(){

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Marcos Santos");
        aluno1.setIdade(15);
        aluno1.setEmail("marcos@gmail.com");


        Aluno aluno2 = new Aluno();
        aluno2.setNome("João Silva");
        aluno2.setIdade(16);
        aluno2.setEmail("joao@gmail.com");

        Aluno aluno3 = new Aluno();
        aluno3.setNome("Diego Ferraz");
        aluno3.setIdade(16);
        aluno3.setEmail("diegof@gmail.com");

        ArrayList<Aluno> lista = new ArrayList<>();

        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);

        return lista;
    }// fecha o método getListaProdutos
}//fim



