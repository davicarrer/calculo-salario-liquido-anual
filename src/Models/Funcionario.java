package Models;

import Utilities.CalculoSalario;

public class Funcionario {
    private String nome;
    private Double salarioLiquido;
    private Double salarioBruto;

    public Funcionario(String nome, Double salarioBruto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        salarioLiquido = CalculoSalario.calculaSalario(salarioBruto);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalarioLiquido() {
        return salarioLiquido;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    @Override
    public String toString() {
        return "Funcionario: "
                + nome +
                "\n  salario liquido anual = R$" + salarioLiquido +
                "\n  baseado no salario bruto mensal = R$" + salarioBruto;
    }
}
