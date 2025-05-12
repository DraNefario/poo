package model;

import java.util.ArrayList;

public class Usuario{
    private int idUsuario;
    private String email;
    private String senha;
    private String dataHora;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String email, String senha, int idUsuario) {
        this.email = email;
        this.senha = senha;
        this.idUsuario = idUsuario;
    }

    public Usuario(String email, String senha, int idUsuario, String dataHora) {
        this.email = email;
        this.senha = senha;
        this.idUsuario = idUsuario;
        this.dataHora = dataHora;
    }


    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
}