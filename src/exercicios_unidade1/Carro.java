package exercicios_unidade1;


public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
        System.out.println(modelo + " ligado!");
    }

    public void desligar() {
        ligado = false;
        System.out.println(modelo + " desligado!");
    }

    public void acelerar() {
        if (ligado) {
            System.out.println(modelo + " está acelerando...");
        } else {
            System.out.println("Não é possível acelerar. O carro está desligado.");
        }
    }

    public void exibirDetalhes() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo + " | Ano: " + ano);
    }
}
