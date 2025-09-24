package exercicios_unidade1;


public class Animal {
    private String nome;
    private String alimentacao;

    public Animal(String nome, String alimentacao) {
        this.nome = nome;
        this.alimentacao = alimentacao;
    }

    public void emitirSom(String som) {
        System.out.println(nome + " faz: " + som);
    }

    public void mostrarInfo() {
        System.out.println("Nome: " + nome + " | Alimentação: " + alimentacao);
    }
}
