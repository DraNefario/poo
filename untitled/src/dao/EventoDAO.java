package dao;

import model.Evento;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EventoDAO {
    private Connection conn;
    private String query;
    private PreparedStatement stmt;

    public EventoDAO(){
        this.conn = ConexaoMySQL.getInstancia().getConexao();
    }

    public ArrayList<Evento> listarTodosEventos(){
        this.query = "SELECT * FROM evento";

        ArrayList<Evento> eventos = new ArrayList<>();
        try{
           this.stmt = this.conn.prepareStatement(this.query);
            ResultSet rs = this.stmt.executeQuery();
            while (rs.next()){
               Evento evento = new Evento(rs.getInt("id_evento"),
                    rs.getInt("tipo"),
                    rs.getString("curso"),
                    rs.getString("titulo"),
                    rs.getString("descricao"),
                    rs.getString("dia_semana"),
                    rs.getString("inicio"),
                    rs.getString("termino"),
                    rs.getString("turno"),
                    rs.getString("palestrante"),
                    rs.getInt("publico"),
                    rs.getString("localizacao"),
                    rs.getInt("vagas"),
                    rs.getString("software_equipamento"),
                    rs.getString("data_hora"));
                eventos.add(evento);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return eventos;
    }
    public ArrayList<Evento> listarTodosEventosDiaSemana(String diaSemana){
        this.query = "SELECT * FROM evento WHERE dia_semana = ?";

        ArrayList<Evento> listaEventos = new ArrayList<>();
        try{
            this.stmt = this.conn.prepareStatement(this.query);
            this.stmt.setString(1, diaSemana);
            ResultSet rs = this.stmt.executeQuery();
            while (rs.next()){
                Evento evento = new Evento(rs.getInt("id_evento"),
                        rs.getInt("tipo"),
                        rs.getString("curso"),
                        rs.getString("titulo"),
                        rs.getString("descricao"),
                        rs.getString("dia_semana"),
                        rs.getString("inicio"),
                        rs.getString("termino"),
                        rs.getString("turno"),
                        rs.getString("palestrante"),
                        rs.getInt("publico"),
                        rs.getString("localizacao"),
                        rs.getInt("vagas"),
                        rs.getString("software_equipamento"),
                        rs.getString("data_hora"));
                listaEventos.add(evento);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return listaEventos;
    }
    public ArrayList<Evento> listarTodosEventosDoCurso(String curso){
        this.query = "SELECT * FROM evento WHERE curso = ?";

        ArrayList<Evento> listaEventos = new ArrayList<>();
        try{
            this.stmt = this.conn.prepareStatement(this.query);
            this.stmt.setString(1, curso);
            ResultSet rs = this.stmt.executeQuery();
            while (rs.next()){
                Evento evento = new Evento(rs.getInt("id_evento"),
                        rs.getInt("tipo"),
                        rs.getString("curso"),
                        rs.getString("titulo"),
                        rs.getString("descricao"),
                        rs.getString("dia_semana"),
                        rs.getString("inicio"),
                        rs.getString("termino"),
                        rs.getString("turno"),
                        rs.getString("palestrante"),
                        rs.getInt("publico"),
                        rs.getString("localizacao"),
                        rs.getInt("vagas"),
                        rs.getString("software_equipamento"),
                        rs.getString("data_hora"));
                listaEventos.add(evento);
            }
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return listaEventos;
    }

    public ArrayList<String> listarCursos() {
        this.query = "SELECT DISTINCT curso FROM evento";

        ArrayList<String> cursos = new ArrayList<>();
        try {
            this.stmt = this.conn.prepareStatement(this.query);
            ResultSet rs = this.stmt.executeQuery();
            while (rs.next()) {
                cursos.add(rs.getString("curso"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cursos;
    }
}
