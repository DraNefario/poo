package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.ListarUsuarioView;
import java.util.List;

public class ListarUsuarioController {

    private UsuarioDAO uDAO;
    private ListarUsuarioView luv;

    public ListarUsuarioController() {
        uDAO = new UsuarioDAO();
        luv = new ListarUsuarioView();

        // Listar usuários
        List<Usuario> usuarios = uDAO.listarUsuarios();
        luv.exibirUsuarios(usuarios);  // Exibe os usuários na interface
    }
}
