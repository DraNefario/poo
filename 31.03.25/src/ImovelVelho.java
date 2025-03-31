public class ImovelVelho extends Imovel{
    private double desconto = 0.2;

    public ImovelVelho(String endereco, double preco){
        super(endereco, preco);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public double calcularPrecoFinal(){
        return getPreco() * (1 - this.desconto);
    }
    public void exibirInformcoesAdicionais(){
        double precoFinal = calcularPrecoFinal();
        System.out.println("Novo preço: " + String.format("%.2f", precoFinal));
    }
}


