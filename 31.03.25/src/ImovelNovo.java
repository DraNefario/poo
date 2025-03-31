public class ImovelNovo extends Imovel {
    private double acrescimo = 0.1;

    public ImovelNovo(String endereco, double preco){
        super(endereco, preco);
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }
    public double calcularPrecoFinal(){
        return getPreco() * (1 + this.acrescimo);
    }
    public void exibirInformcoesAdicionais(){
        double precoFinal = calcularPrecoFinal();
        System.out.println("Novo preço: " + String.format("%.2f", precoFinal));
    }
}
