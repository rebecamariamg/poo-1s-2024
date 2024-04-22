package atividade1;
import java.util.Scanner;

public class ExecCalculadora{
    public static void main(String[] args) {

        int opcao;
        Scanner sc = new Scanner(System.in);

        System.out.println("*************************************");
        System.out.println("Selecione a opção desejada da calculadora: ");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Dividir");
        System.out.println("4 - Multiplicar");
        System.out.println("5 - Verificar se um numero é primo");
        System.out.println("*************************************");

        opcao = sc.nextInt();

        double num1;
        double num2;

        switch (opcao) {
            case 1:
                Calculadora soma = new Calculadora();

                System.out.println("Digite o primeiro numero: ");
                num1 = sc.nextDouble();
                soma.setNumA(num1);
                System.out.println("Digite o segundo numero: ");
                num2 = sc.nextDouble();
                soma.setNumB(num2);
                sc.close();
                
                soma.somar(num1, num2);
                break;
        
            case 2:
                Calculadora subtracao = new Calculadora();

                System.out.println("Digite o primeiro numero: ");
                num1 = sc.nextDouble();
                subtracao.setNumA(num1);
                System.out.println("Digite o segundo numero: ");
                num2 = sc.nextDouble();
                subtracao.setNumB(num2);
                sc.close();
                
                subtracao.subtrair(num1, num2);
                break;
            
            case 3:
                Calculadora divisao = new Calculadora();

                System.out.println("Digite o primeiro numero: ");
                num1 = sc.nextDouble();
                divisao.setNumA(num1);
                System.out.println("Digite o segundo numero: ");
                num2 = sc.nextDouble();
                divisao.setNumB(num2);
                sc.close();
                
                divisao.dividir(num1, num2);
                break;

            case 4:
                Calculadora multiplicacao = new Calculadora();

                System.out.println("Digite o primeiro numero: ");
                num1 = sc.nextDouble();
                multiplicacao.setNumA(num1);
                System.out.println("Digite o segundo numero: ");
                num2 = sc.nextDouble();
                multiplicacao.setNumB(num2);
                sc.close();
                
                multiplicacao.multiplicar(num1, num2);
                break;

                case 5:
                Calculadora numPrimo = new Calculadora();
            
                System.out.println("Digite o número a ser verificado: ");
                int num = sc.nextInt();
                numPrimo.setVerificacaoNumeroPrimo(num);
                sc.close();
                            
                numPrimo.verificarNumeroPrimo(num);
                break;

            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
