package controller;

import dao.UsuarioDAO;
import java.util.Scanner;
import view.RemoverUsuarioView;

public class RemoverUsuarioController {

    private UsuarioDAO uDAO;
    private RemoverUsuarioView ruv;
    private Scanner sc;

    public RemoverUsuarioController() {
        uDAO = new UsuarioDAO();
        sc = new Scanner(System.in);
        solicitarIdParaDeletar();

    }

    private void solicitarIdParaDeletar() {
        System.out.print("Digite o ID do usuário a ser deletado: ");
        int id = sc.nextInt();
        uDAO.deletarUsuario(id);
    }
}
