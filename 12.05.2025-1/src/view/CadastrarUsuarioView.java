package view;

import model.Usuario;

import java.util.Scanner;

public class CadastrarUsuarioView {

    private Scanner sc;

    public CadastrarUsuarioView(){
        this.sc = new Scanner(System.in);
    }
    public Usuario cadastro(){
        System.out.println("Cadastro");
        System.out.println("Nome: ");
        String nome = sc.nextLine();
        System.out.println("Senha: ");
        String senha = sc.nextLine();
        return new Usuario(nome,senha);
    }
}
