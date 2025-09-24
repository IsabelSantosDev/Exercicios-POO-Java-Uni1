package exercicios_unidade1;


public class Main {
    public static void main(String[] args) {
        
        // Testando Circulo
        Circulo c = new Circulo(5);
        c.exibirInfo();

        // Testando Pessoa
        Pessoa p = new Pessoa("Ana", 25);
        p.cumprimentar();

        // Testando Livro
        Livro l = new Livro("Dom Casmurro", "Machado de Assis", 256);
        l.exibirDetalhes();

        // Testando Retangulo
        Retangulo r = new Retangulo(10, 4);
        System.out.println("Área do Retângulo: " + r.calcularArea());
        System.out.println("Perímetro do Retângulo: " + r.calcularPerimetro());

        // Testando Animal
        Animal a = new Animal("Leão", "Carnívoro");
        a.emitirSom("Rugido");

        // Testando Produto
        Produto prod = new Produto("Camiseta", 50.0);
        prod.exibirProduto();
        System.out.println("Preço com 10% de desconto: R$" + prod.aplicarDesconto(10));

        // Testando Triangulo
        Triangulo t = new Triangulo(6, 3);
        System.out.println("Área do Triângulo: " + t.calcularArea());

        // Testando ContaBancaria
        ContaBancaria conta = new ContaBancaria("1234-5", 1000.0);
        conta.depositar(200);
        conta.sacar(500);

        // Testando Carro
        Carro carro = new Carro("Fiat", "Uno", 2010);
        carro.ligar();
        carro.acelerar();
        carro.desligar();

        // Testando Funcionario
        Funcionario f = new Funcionario("João", "Analista", 3000.0);
        f.aplicarAumento(15);
    }
}
