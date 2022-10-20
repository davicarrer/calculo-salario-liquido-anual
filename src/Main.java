import Models.Funcionario;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Digite o nome do funcionário: ");

        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Luiz",1200.0));
        funcionarios.add(new Funcionario("Carlos",1800.0));
        funcionarios.add(new Funcionario("Maria",2900.0));
        funcionarios.add(new Funcionario("Joana",4500.0));
        funcionarios.add(new Funcionario("Igor",8200.0));

        for (Funcionario f: funcionarios) {
            System.out.println(f.toString());
        }

    }
}