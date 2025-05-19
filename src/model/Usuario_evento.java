package model;

public class Usuario_evento {
    private Integer id_user_event;
    private Integer id_user;
    private Integer id_event;
    private Integer checkin;
    private String data_hora;

    public Usuario_evento(Integer id_user_event, Integer id_user, Integer id_event, Integer checkin, String data_hora) {
        this.id_user_event = id_user_event;
        this.id_user = id_user;
        this.id_event = id_event;
        this.checkin = checkin;
        this.data_hora = data_hora;
    }


    public Integer getId_user_event() {
        return id_user_event;
    }

    public void setId_user_event(Integer id_user_event) {
        this.id_user_event = id_user_event;
    }

    public Integer getId_user() {
        return id_user;
    }

    public void setId_user(Integer id_user) {
        this.id_user = id_user;
    }

    public Integer getId_event() {
        return id_event;
    }

    public void setId_event(Integer id_event) {
        this.id_event = id_event;
    }

    public Integer getCheckin() {
        return checkin;
    }

    public void setCheckin(Integer checkin) {
        this.checkin = checkin;
    }

    public String getData_hora() {
        return data_hora;
    }

    public void setData_hora(String data_hora) {
        this.data_hora = data_hora;
    }
}
