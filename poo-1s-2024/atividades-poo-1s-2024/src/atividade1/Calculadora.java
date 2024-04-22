package atividade1;

public class Calculadora {
    private double numA;
    private double numB;
    private int verificacaoNumeroPrimo;

    double somar(double numA, double numB){
        double soma = numA + numB;
        System.out.printf("A soma é: %.2f \n", soma);
        return soma;
    }

    double subtrair(double numA, double numB){
        double subtracao = numA - numB;
        System.out.printf("A subtração é: %.2f \n", subtracao);
        return subtracao;
    }

    double multiplicar(double numA, double numB){
        double produto = numA * numB;
        System.out.printf("O produto é: %.2f \n", produto);
        return produto;
    }

    double dividir(double numA, double numB){
        double divisao = numA / numB;
        System.out.printf("A divisão é: %.2f \n", divisao);
        return divisao;
    }

    String verificarNumeroPrimo(int verificacaoNumeroPrimo){
        String ehNumeroPrimo;
        int numDivisores = 0;
    
        for(int i = 1; i <= verificacaoNumeroPrimo; i++){
            if (verificacaoNumeroPrimo % i == 0) {
                numDivisores++;
            }
        }
        
        if(numDivisores == 2) {
            ehNumeroPrimo = "Sim";
        } else {
            ehNumeroPrimo = "Não";
        }
    
        System.out.printf("É número primo? %s\n", ehNumeroPrimo);
    
        return ehNumeroPrimo;
    }

    //getters e setters

    public double getNumA() {
        return numA;
    }

    public void setNumA(double numA) {
        this.numA = numA;
    }

    public double getNumB() {
        return numB;
    }

    public void setNumB(double numB) {
        this.numB = numB;
    }

    public int getVerificacaoNumeroPrimo() {
        return verificacaoNumeroPrimo;
    }

    public void setVerificacaoNumeroPrimo(int verificacaoNumeroPrimo) {
        this.verificacaoNumeroPrimo = verificacaoNumeroPrimo;
    }

}