public class Restaurante {
    private String nome;
    private String culinaria;
    private String CNPJ;
    private String cardapio;
    private Pessoa Chef;

    public Restaurante(String nome, String culinaria, String CNPJ, String cardapio){
        this.nome = nome;
        this.culinaria = culinaria;
        this.CNPJ = CNPJ;
        this.cardapio = cardapio;
    }


    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getCulinaria(){
        return this.culinaria;
    }
    public void setCulinaria(String culinaria){
        this.culinaria = culinaria;
    }
    public String getCNPJ(){
        return this.CNPJ;
    }
    public void setCNPJ(String CNPJ){
        this.CNPJ = CNPJ;
    }
    public String getCardapio(){
        return this.cardapio;
    }
    public void setCardapio(String caardapio){
        this.cardapio = cardapio;
    }
    public Pessoa getChef(){
        return this.Chef;
    }
    public void setChef(Pessoa Chef){
        this.Chef = Chef;
    }


}
