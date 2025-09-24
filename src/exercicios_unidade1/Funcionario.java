package exercicios_unidade1;


public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void aplicarAumento(double percentual) {
        salario += salario * percentual / 100;
        System.out.println("Novo salário de " + nome + ": R$" + salario);
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + " | Cargo: " + cargo + " | Salário: R$" + salario);
    }

}