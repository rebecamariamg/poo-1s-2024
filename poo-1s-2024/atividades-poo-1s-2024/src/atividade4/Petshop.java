package atividade4;

import java.util.Scanner;

public class Petshop {
    public static void main(String[] args) {
        Servico banho = new Servico("Banho", 50.0);
        Servico tosa = new Servico("Tosa", 30.0);
        Servico consultaVeterinaria = new Servico("Consulta Veterinária", 80.0);
        Servico vacina = new Servico("Vacina", 100.0);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do animal: ");
        String nomeAnimal = scanner.nextLine();

        System.out.println("Serviços disponíveis:");
        System.out.println("1. " + banho.getNome() + " - R$" + banho.getPreco());
        System.out.println("2. " + tosa.getNome() + " - R$" + tosa.getPreco());
        System.out.println("3. " + consultaVeterinaria.getNome() + " - R$" + consultaVeterinaria.getPreco());
        System.out.println("4. " + vacina.getNome() + " - R$" + vacina.getPreco());

        System.out.print("Escolha os serviços (digite os números separados por espaço): ");
        String[] escolhas = scanner.nextLine().split(" ");

        double valorTotal = 0.0;
        StringBuilder detalhesServicos = new StringBuilder();
        for (String escolha : escolhas) {
            switch (escolha) {
                case "1":
                    valorTotal += banho.getPreco();
                    detalhesServicos.append("Banho, ");
                    break;
                case "2":
                    valorTotal += tosa.getPreco();
                    detalhesServicos.append("Tosa, ");
                    break;
                case "3":
                    valorTotal += consultaVeterinaria.getPreco();
                    detalhesServicos.append("Consulta Veterinária, ");
                    break;
                case "4":
                    valorTotal += vacina.getPreco();
                    detalhesServicos.append("Vacina, ");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        System.out.println("Serviços realizados para " + nomeAnimal + ":");
        System.out.println("Serviços: " + detalhesServicos.toString().replaceAll(", $", ""));
        System.out.println("Total a pagar: R$" + valorTotal);

        scanner.close();
    }
}
