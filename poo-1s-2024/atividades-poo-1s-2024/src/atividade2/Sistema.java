package atividade2;

import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        Biblioteca livraria = new Biblioteca();



        while(opcao != 4){
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Detalhar livro");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();
        

            switch (opcao) {
                case 1:
                    System.out.println("Adicionando livro");
                    int id; String titulo; String nomeAutor; String anoPublicacao; String editora;
                    System.out.println("ID: ");
                    id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Título: ");
                    titulo = sc.nextLine();
                    System.out.println("Nome Autor: ");
                    nomeAutor = sc.nextLine();
                    System.out.println("Ano de Publicação: ");
                    anoPublicacao = sc.nextLine();
                    System.out.println("Editora: ");
                    editora = sc.nextLine();

                    Livro l = new Livro(id, titulo, nomeAutor, anoPublicacao, editora);
                    livraria.cadastrarLivro(l);

                    break;
                case 2:
                    System.out.println("Listando livro");
                    System.out.println(livraria.listarLivros());
                    break;
                case 3:
                    System.out.println("Detalhando livro");
                    break;
                case 4:
                    System.out.println("Saindo");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
        sc.close();
    }
}