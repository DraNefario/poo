package view;

import java.util.Scanner;

public class MenuView {
    private Scanner sc;

    public MenuView() {
        this.sc = new Scanner(System.in);
    }

    public int opcoesMenu() {
        this.sc = new Scanner(System.in);
        System.out.println("\n*** MENU ***");
        System.out.println("\n[1] Listar eventos");
        System.out.println("[2] Listar eventos (segunda)");
        System.out.println("[3] Listar eventos (terça)");
        System.out.println("[4] Listar eventos (quarta)");
        System.out.println("[5] Listar eventos (quinta)");
        System.out.println("[6] Listar eventos (sexta)");
        System.out.println("[7] Listar eventos por curso\n");
        System.out.println("[9] Sair\n");
        System.out.print("Opcão: ");
        return sc.nextInt();
    }

    public int opcoesMenuCurso() {
        this.sc = new Scanner(System.in);
        System.out.println("\n*** MENU CURSOS ***");
        System.out.println("[1] ciencia da computaçao");
        return sc.nextInt();
    }

    public void opcaoInvalida() {
        System.out.println("Opção Inválida!");
    }

    public void opcaoSair() {
        System.out.println("Sistema encerrado!");
    }
}