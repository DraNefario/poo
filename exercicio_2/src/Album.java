public class Album {
    private String genero;
    private int ano;
    private String nomeAlbum;
    private Pessoa artista;
    private Musica musica;

    public Album(String nomeAlbum, String genero, int ano, Pessoa artista, Musica musica){
    this.nomeAlbum = nomeAlbum;
    this.genero = genero;
    this.ano = ano;
    this.artista = artista;
    this.musica = musica;
    }

    public String getNomeAlbum(){
        return this.nomeAlbum;
    }
    public void setNome(String nome){
        this.nomeAlbum = nome;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String Genero){
        this.genero = genero;
    }
    public int getAno(){
        return this.ano;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public Pessoa getArtista(){
        return this.artista;
    }
    public void setArtista(Pessoa artista){
        this.artista = artista;
    }
    public Musica getMusica(){
        return this.musica;
    }
    public void setMusica(Musica musica){
        this.musica = musica;
    }


}
