public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco){
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    public void exibirInformacoes(){
        System.out.println("Preço: " + preco);
        System.out.println("Endereço: " + endereco);

    }
}
