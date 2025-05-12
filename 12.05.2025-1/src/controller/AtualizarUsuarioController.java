package controller;

import dao.UsuarioDAO;
import model.Usuario;
import view.AtualizarUsuarioView;

public class AtualizarUsuarioController {

    private AtualizarUsuarioView auv;
    private Usuario usuario;
    private UsuarioDAO uDAO;


    public AtualizarUsuarioController(){
        this.auv = new AtualizarUsuarioView();
        this.usuario = auv.atualizar();
        uDAO = new UsuarioDAO();
        uDAO.atualizarUsuario(this.usuario);
    }

}