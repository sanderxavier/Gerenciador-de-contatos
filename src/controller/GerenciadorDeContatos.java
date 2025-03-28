package controller;

import model.Contato;
import java.util.ArrayList;
import java.util.Scanner;


public class GerenciadorDeContatos {
    private ArrayList<Contato> listaContatos;
    private Scanner scanner;

    public GerenciadorDeContatos() {
        listaContatos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adiconarContato() {
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        System.out.println("Telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("E-mail: ");
        String email = scanner.nextLine();

        Contato contato = new Contato(nome, telefone, email);
        listaContatos.add(contato);
        System.out.println("Contato adicionado com sucesso!\n");
    }

    public void listarContatos() {
        if (listaContatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.");
            return;
        }

        System.out.println("\nLista de Contatos:");
        for (Contato contato : listaContatos) {
            contato.exibirContato();
        }
    }

    public void buscarContato() {
        System.out.println("Digite o nome do contato: ");
        String nomeBusca = scanner.nextLine();
        boolean encontrado = false;

        for (Contato contato : listaContatos) {
            if (contato.getNome().equalsIgnoreCase(nomeBusca)) {
                System.out.println("\nContato encontrado: ");
                contato.exibirContato();
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Contato não encontrado.\n");
        }
    }

    public void excluirContato() {
        System.out.println("Digite o nome do contato");
        String nome = scanner.nextLine();
        boolean removido = listaContatos.removeIf(listaContatos -> listaContatos.getNome().equalsIgnoreCase(nome));

        if (removido) {
            System.out.println("Contato removido com sucesso!");
        } else {
            System.out.println("Contato não encontrado.");
        }
    }
}
