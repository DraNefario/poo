public class Animal {
    private String nome;
    private int idade;
    private double peso;
    private String raca;

    public Animal(String nome, int idade, double peso, String raca){
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    public void comer(){
        System.out.print("Nham Nham Nham ..... Nham ..." + "\n");

    }
    public void dormir(){
        System.out.print("ZZZzzzzzZZZZZzzzZZzzz .... ZZzzZZzzzz..." + "\n");

    }
    public void exibirInformacoes(){
        System.out.print("Nome: " + nome);
        System.out.print(" Idade: " + idade);
        System.out.print(" Peso: " + peso);
        System.out.print(" Raça: " + raca);
    }
}
