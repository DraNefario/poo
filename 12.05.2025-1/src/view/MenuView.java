package view;

import java.util.Scanner;

public class MenuView {

    private Scanner sc;

    public MenuView(){
        this.sc = new Scanner(System.in);

    }

    public int opcoesMenu(){
        System.out.println("***MENU***");
        System.out.println("[1] Cadastrar Usuario");
        System.out.println("[2] Listar Usuario");
        System.out.println("[3] Atualizar Usuario");
        System.out.println("[4] Remover Usuario");
        System.out.println("[9] Sair\n");
        System.out.print("Opcão: ");
        return sc.nextInt();
    }

    public void telaOpcaoInvalida(){
        System.out.println("Opção invalida!");

    }
}
