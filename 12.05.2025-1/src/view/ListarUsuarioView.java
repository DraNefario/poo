package view;

import model.Usuario;
import java.util.List;

public class ListarUsuarioView {

    public void exibirUsuarios(List<Usuario> usuarios) {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário encontrado.");
        } else {
            System.out.println("Usuários cadastrados:");
            for (Usuario usuario : usuarios) {
                System.out.println("ID: " + usuario.getIdUsuario());
                System.out.println("Email: " + usuario.getEmail());
                System.out.println("Senha: " + usuario.getSenha());
                System.out.println("----------------------------");
            }
        }
    }
}
