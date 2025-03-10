import java.util.Scanner;
public class Pessoa {
    private String nome;
    private String DataDeNascimento;
    private String CPF;

    Scanner scanner = new Scanner(System.in);

    public Pessoa(String nome, String DataDeNascimento, String CPF){
        this.nome = nome;
        this.DataDeNascimento = DataDeNascimento;
        this.CPF = CPF;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getDataDeNascimento(){
        return this.DataDeNascimento;
    }
    public void setDataDeNascimento(String DataDeNascimento){
        this.DataDeNascimento = DataDeNascimento;
    }
    public String getCPF(){
        return this.CPF;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
}
