package view;

import model.Usuario;

import java.util.Scanner;

public class AtualizarUsuarioView {

    private Scanner sc;

    public AtualizarUsuarioView(){
        this.sc = new Scanner(System.in);
    }
    public Usuario atualizar(){
        System.out.println("Atualizar usuario");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();
        System.out.println("Id: ");
        int id = sc.nextInt();
        return new Usuario(nome,senha,id);
    }
}
