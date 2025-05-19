package controller;

import controller.ListarEventosController;
import view.MenuView;

public class MenuController {

    private MenuView mv;

    public MenuController() {
        mv =  new MenuView();
        int opcao = 0;
        while (opcao != 9) {
            opcao = mv.opcoesMenu();
            switch (opcao) {
                case 1:
                    ListarEventosController.listarTodos();
                    break;
                case 2:
                    ListarEventosController.listarDia("segunda");
                    break;
                case 3:
                    ListarEventosController.listarDia("terca");
                    break;
                case 4:
                    ListarEventosController.listarDia("quarta");
                    break;
                case 5:
                    ListarEventosController.listarDia("quinta");
                    break;
                case 6:
                    ListarEventosController.listarDia("sexta");
                    break;
                case 7:
                    opcao = mv.opcoesMenuCurso();
                    switch (opcao) {
                        case 1:
                            ListarEventosController.listarCurso("Ciência da Computação");
                            break;
                        default:
                            mv.opcaoInvalida();
                            break;
                    }
                    break;
                case 9:
                    mv.opcaoSair();
                    break;
                default:
                    mv.opcaoInvalida();
                    break;
            }
        }
    }
}
