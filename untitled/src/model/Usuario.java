package model;

public class Usuario {
    private Integer id_user;
    private String nome;
    private String curso;
    private String senha;
    private Integer nivel_acesso;
    private Integer confirmacao;
    private Integer token_confirmacao;
    private Integer token_recuperacao;
    private String data_hora;

    public Usuario(Integer id_user, String nome, String curso, String senha, Integer nivel_acesso, Integer confirmacao, Integer token_confirmacao, Integer token_recuperacao, String data_hora) {
        this.id_user = id_user;
        this.nome = nome;
        this.curso = curso;
        this.senha = senha;
        this.nivel_acesso = nivel_acesso;
        this.confirmacao = confirmacao;
        this.token_confirmacao = token_confirmacao;
        this.token_recuperacao = token_recuperacao;
        this.data_hora = data_hora;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Integer getNivel_acesso() {
        return nivel_acesso;
    }

    public void setNivel_acesso(Integer nivel_acesso) {
        this.nivel_acesso = nivel_acesso;
    }

    public Integer getConfirmacao() {
        return confirmacao;
    }

    public void setConfirmacao(Integer confirmacao) {
        this.confirmacao = confirmacao;
    }

    public Integer getToken_confirmacao() {
        return token_confirmacao;
    }

    public void setToken_confirmacao(Integer token_confirmacao) {
        this.token_confirmacao = token_confirmacao;
    }

    public Integer getToken_recuperacao() {
        return token_recuperacao;
    }

    public void setToken_recuperacao(Integer token_recuperacao) {
        this.token_recuperacao = token_recuperacao;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }
}
