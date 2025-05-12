package controller;

import view.MenuView;


public class MenuController {

    private CadastrarUsuarioController cuc;
    private AtualizarUsuarioController auv;
    private ListarUsuarioController luv;
    private MenuView mv;

    public MenuController(){

        mv = new MenuView();
        int opcao = 0;
        while (opcao != 9){
            opcao = mv.opcoesMenu();
            if(opcao == 1) {
                cuc = new CadastrarUsuarioController();
            }
            else if(opcao == 2){
                luv = new ListarUsuarioController();
            }
            else if(opcao == 3){
                auv = new AtualizarUsuarioController();
            }
            else{
                mv.telaOpcaoInvalida();
            }
        }
    }
}
