package ads.poo;

import java.util.Scanner;

public class App {
    private Agenda agenda;
    private Scanner sc;

    public App(Agenda agenda) {
        this.agenda = agenda;
        this.sc = new Scanner(System.in);
    }
    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        App app = new App(agenda);
        app.menu();
    }

    public void menu() {
        int op;
        do {
            System.out.println("\n===== MENU AGENDA =====");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Adicionar telefone a contato");
            System.out.println("4. Adicionar email a contato");
            System.out.println("5. Remover contato");
            System.out.println("6. Remover telefone de contato");
            System.out.println("7. Remover email de contato");
            System.out.println("8. Sair");
            System.out.print("Escolha uma opção: ");
            op = Integer.parseInt(sc.nextLine());

            switch (op) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    adicionarTelefone();
                    break;
                case 4:
                    adicionarEmail();
                    break;
                case 5:
                    removerContato();
                    break;
                case 6:
                    removerTelefone();
                    break;
                case 7:
                    removerEmail();
                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (op != 8);
    }

    private void adicionarContato() {
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("Sobrenome: ");
        String sobrenome = sc.nextLine();
        System.out.print("Data de nascimento (AAAA-MM-DD): ");
        String data = sc.nextLine();
        Contato c = new Contato(nome, sobrenome, data);
        agenda.addContato(c);
        System.out.println("Contato adicionado!");
    }

    private void listarContatos() {
        System.out.println("\nContatos:");
        System.out.println(agenda);
    }

    private void adicionarTelefone() {
        listarContatos();
        System.out.print("Índice do contato: ");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.print("Rótulo do telefone: ");
        String rotulo = sc.nextLine();
        System.out.print("Número (11 dígitos): ");
        String numero = sc.nextLine();
        if (agenda.addTelefone(rotulo, numero, idx)) {
            System.out.println("Telefone adicionado!");
        } else {
            System.out.println("Falha ao adicionar telefone.");
        }
    }

    private void adicionarEmail() {
        listarContatos();
        System.out.print("Índice do contato: ");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.print("Rótulo do email: ");
        String rotulo = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        if (agenda.addEmail(rotulo, email, idx)) {
            System.out.println("Email adicionado!");
        } else {
            System.out.println("Falha ao adicionar email.");
        }
    }

    private void removerContato() {
        listarContatos();
        System.out.print("Índice do contato para remover: ");
        int idx = Integer.parseInt(sc.nextLine());
        if (agenda.removeContato(idx)) {
            System.out.println("Contato removido!");
        } else {
            System.out.println("Índice inválido.");
        }
    }

    private void removerTelefone() {
        listarContatos();
        System.out.print("Índice do contato: ");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.print("Rótulo do telefone para remover: ");
        String rotulo = sc.nextLine();
        if (agenda.removeTelefone(rotulo, idx)) {
            System.out.println("Telefone removido!");
        } else {
            System.out.println("Falha ao remover telefone.");
        }
    }

    private void removerEmail() {
        listarContatos();
        System.out.print("Índice do contato: ");
        int idx = Integer.parseInt(sc.nextLine());
        System.out.print("Rótulo do email para remover: ");
        String rotulo = sc.nextLine();
        if (agenda.removeEmail(rotulo, idx)) {
            System.out.println("Email removido!");
        } else {
            System.out.println("Falha ao remover email.");
        }
    }

    

}