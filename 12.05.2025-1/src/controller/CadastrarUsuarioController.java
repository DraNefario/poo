package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.CadastrarUsuarioView;

public class CadastrarUsuarioController {

    private CadastrarUsuarioView cuv;
    private Usuario usuario;
    private UsuarioDAO uDAO;


    public CadastrarUsuarioController(){
        this.cuv = new CadastrarUsuarioView();
        this.usuario = cuv.cadastro();
        uDAO = new UsuarioDAO();
        uDAO.criarUsuario(this.usuario);
    }

}
