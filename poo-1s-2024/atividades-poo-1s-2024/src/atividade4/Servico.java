package atividade4;

public class Servico {
    private String nome;
    private double preco;

    public Servico(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String retornaLinhaCusto() {
        return "Serviço: " + nome + " || R$: " + preco;
    }
}

