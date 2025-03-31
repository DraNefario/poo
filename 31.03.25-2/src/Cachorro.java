public class Cachorro extends Animal{
    private String porte;

    public Cachorro (String nome, int idade, double peso, String raca, String porte){
        super(nome, idade, peso, raca);
        this.porte = porte;
    }

    public String getPorte() {
        return porte;
    }

    public void setPorte(String porte) {
        this.porte = porte;
    }
    public void latir(){
        System.out.print("Roof Roof Roof Roof" + "\n");
    }
    public void imprimirInformacoes(){
        System.out.print(" Porte: " + porte + "\n");
    }
}
