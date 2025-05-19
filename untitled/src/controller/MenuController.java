package controller;

import dao.EventoDAO;
import view.MenuView;
import java.util.ArrayList;

public class MenuController {

    private MenuView mv;
    private EventoDAO eDAO;

    public MenuController() {
        mv =  new MenuView();
        eDAO = new EventoDAO();
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
                    ArrayList<String> cursos = eDAO.listarCursos();
                    opcao = mv.opcoesMenuCurso(cursos);
                    switch (opcao) {
                        case 0:
                            break;

                        default:
                            String cursoSelecionado = cursos.get(opcao - 1);
                            ListarEventosController.listarCurso(cursoSelecionado);
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
