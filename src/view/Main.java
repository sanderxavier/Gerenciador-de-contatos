package view;

import controller.GerenciadorDeContatos;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorDeContatos gerenciador = new GerenciadorDeContatos();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nGerenciador de Contatos");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contato");
            System.out.println("3. Buscar Contato");
            System.out.println("4. Excluir contato");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    gerenciador.adiconarContato();
                    break;
                case 2:
                    gerenciador.listarContatos();
                    break;
                case 3:
                    gerenciador.buscarContato();
                    break;
                case 4:
                    gerenciador.excluirContato();
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }    
}
