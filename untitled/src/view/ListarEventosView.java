package view;

import model.Evento;

import java.util.ArrayList;

public class ListarEventosView {

    public void listarTodosEventos(ArrayList<Evento> eventos){
        System.out.println("***** EVENTOS *****");
        for(Evento evento : eventos){
            System.out.printf("ID: %s | Tipo: %s | Curso: %s%n",
                    evento.getId_event(), evento.getTipo(), evento.getCurso());
            System.out.printf("Título: %s%n", evento.getTitulo());
            System.out.printf("Descrição: %s%n", evento.getDescricao());
            System.out.printf("Dia da Semana: %s | Início: %s | Término: %s | Turno: %s%n",
                    evento.getDia_semana(), evento.getInicio(), evento.getTermino(), evento.getTurno());
            System.out.printf("Palestrante: %s | Público: %s%n",
                    evento.getPalestrante(), evento.getPublico());
            System.out.printf("Localização: %s | Vagas: %d%n",
                    evento.getLocalizacao(), evento.getVagas());
            System.out.printf("Software Equipamento: %s | Data-Hora: %s%n",
                    evento.getSoftware_equipamento(), evento.getData_hora());
            System.out.println("--------------------------------------------------\n");
        }
    }
}
