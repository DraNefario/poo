public class Musica {
    private String titulo;
    private double duracao;

    public Musica(String titulo, double duracao){
    this.titulo = titulo;
    this.duracao = duracao;
    }

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public double getDuracao(){
        return this.duracao;
    }
    public void setDuracao(float duracao){
        this.duracao = duracao;
    }


}