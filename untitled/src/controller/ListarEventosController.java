package controller;

import dao.EventoDAO;
import view.ListarEventosView;

public class ListarEventosController {
    private ListarEventosView ltev;
    private EventoDAO eventoDao;

    public ListarEventosController() {
        this.ltev = new ListarEventosView();
        eventoDao = new EventoDAO();
    }

    public static ListarEventosController listarTodos() {
        ListarEventosController controller = new ListarEventosController();
        controller.ltev.listarTodosEventos(controller.eventoDao.listarTodosEventos());
        return controller;
    }

    public static ListarEventosController listarDia(String diaSemana) {
        ListarEventosController controller = new ListarEventosController();
        controller.ltev.listarTodosEventos(controller.eventoDao.listarTodosEventosDiaSemana(diaSemana));
        return controller;
    }

    public static ListarEventosController listarCurso(String curso) {
        ListarEventosController controller = new ListarEventosController();
        controller.ltev.listarTodosEventos(controller.eventoDao.listarTodosEventosDoCurso(curso));
        return controller;
    }

}

