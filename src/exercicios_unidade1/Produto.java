package exercicios_unidade1;


public class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public double aplicarDesconto(double percentual) {
        return preco - (preco * percentual / 100);
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome + " | Preço: R$" + preco);
    }
}
