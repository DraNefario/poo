package model;

public class Evento {
    private Integer id_event;
    private Integer tipo;
    private String curso;
    private String titulo;
    private String descricao;
    private String dia_semana;
    private String inicio;
    private String termino;
    private String turno;
    private String palestrante;
    private Integer publico;
    private String localizacao;
    private Integer vagas;
    private String software_equipamento;
    private String data_hora;

    public Evento(Integer id_event, Integer tipo, String curso, String titulo, String descricao, String dia_semana, String inicio, String termino, String turno, String palestrante, Integer publico, String localizacao, Integer vagas, String software_equipamento, String data_hora) {
        this.id_event = id_event;
        this.tipo = tipo;
        this.curso = curso;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dia_semana = dia_semana;
        this.inicio = inicio;
        this.termino = termino;
        this.turno = turno;
        this.palestrante = palestrante;
        this.publico = publico;
        this.localizacao = localizacao;
        this.vagas = vagas;
        this.software_equipamento = software_equipamento;
        this.data_hora = data_hora;
    }

    public Integer getId_event() {
        return id_event;
    }

    public void setId_event(Integer id_event) {
        this.id_event = id_event;
    }

    public Integer getTipo() {
        return tipo;
    }

    public void setTipo(Integer tipo) {
        this.tipo = tipo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDia_semana() {
        return dia_semana;
    }

    public void setDia_semana(String dia_semana) {
        this.dia_semana = dia_semana;
    }

    public String getInicio() {
        return inicio;
    }

    public void setInicio(String inicio) {
        this.inicio = inicio;
    }

    public String getTermino() {
        return termino;
    }

    public void setTermino(String termino) {
        this.termino = termino;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(String palestrante) {
        this.palestrante = palestrante;
    }

    public Integer getPublico() {
        return publico;
    }

    public void setPublico(Integer publico) {
        this.publico = publico;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public Integer getVagas() {
        return vagas;
    }

    public void setVagas(Integer vagas) {
        this.vagas = vagas;
    }

    public String getSoftware_equipamento() {
        return software_equipamento;
    }

    public void setSoftware_equipamento(String software_equipamento) {
        this.software_equipamento = software_equipamento;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }
}
