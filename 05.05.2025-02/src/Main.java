import dao.UsuarioDAO;
import model.Usuario;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        //Usuario u = new Usuario("Thomas Steinhausser", "123456");
        //UsuarioDAO uDAO = new UsuarioDAO();
        //uDAO.criarUsuario(u);

        UsuarioDAO uDAO = new UsuarioDAO();
        ArrayList<Usuario> lista = uDAO.listarUsuarios();

        for(int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i).getEmail());
            System.out.println(lista.get(i).getSenha());
            System.out.println("---------------------");
        }
    Usuario updateUsuario = new Usuario( "newton", "24532");
    UsuarioDAO.atualizarUsuario(updateUsuario);
    }
}
