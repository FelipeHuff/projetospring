package felipe.huff.projetofuncionario.controle;


import felipe.huff.projetofuncionario.modelo.Funcionario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class FuncionarioControle {

    @GetMapping("/funcionario")
    public Funcionario getFuncionario(){
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Zé Santos");
        funcionario.setEmail("ze@hotmail.com");
        funcionario.setSalario(3500);

        return funcionario;
    }


    @GetMapping("/listafuncionarios")

    public ArrayList<Funcionario> getListaFuncionarios(){

        Funcionario funcionario1 = new Funcionario();
        funcionario1.setNome("Andre Silveira");
        funcionario1.setSalario(15000);
        funcionario1.setEmail("silveira@gmail.com");


        Funcionario funcionario2 = new Funcionario();
        funcionario2.setNome("Jose Ronaldo");
        funcionario2.setSalario(1500);
        funcionario2.setEmail("zeronaldo@gmail.com");

        Funcionario funcionario3 = new Funcionario();
        funcionario3.setNome("Julia Luiza");
        funcionario3.setSalario(5000);
        funcionario3.setEmail("julia@gmail.com");

        Funcionario funcionario4 = new Funcionario();
        funcionario4.setNome("Marcia Oliveira");
        funcionario4.setSalario(3000);
        funcionario4.setEmail("marciaoliveira@gmail.com");

        ArrayList<Funcionario> lista = new ArrayList<>();

        lista.add(funcionario1);
        lista.add(funcionario2);
        lista.add(funcionario3);
        lista.add(funcionario4);

        return lista;
    }
}//fim



