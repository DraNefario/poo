public class Gato extends Animal{
    private String cor;

    public Gato(String nome, String cor, int idade, double peso, String raca){
        super(nome, idade, peso, raca);
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    public void aranhar(){
        System.out.print("Arranhando" + "\n");
    }
    public void miando(){
        System.out.print("Miando" + "\n");
    }
    public void imprimirInformacoes(){
        System.out.print(" Cor: " + cor + "\n");
    }
}
