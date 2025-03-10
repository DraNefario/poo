import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do artista: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do artist: ");
        int idade = scanner.nextInt();
        scanner.nextLine();

        Pessoa P1 = new Pessoa(nome, idade);

        System.out.println("Digite o tirulo da musica: ");
        String titulo = scanner.nextLine();

        System.out.println("Digite a duracao da musica: ");
        double duracao = scanner.nextDouble();
        scanner.nextLine();

        Musica M1 = new Musica(titulo, duracao);

        System.out.println("Digite o genero da musica: ");
        String genero = scanner.nextLine();

        System.out.println("Digite o ano do album: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do album: ");
        String nomeAlbum = scanner.nextLine();

        Album A1 = new Album(nomeAlbum, genero, ano, P1, M1);


        System.out.println("Album: " + A1.getNomeAlbum());
        System.out.println("Genero: " + A1.getGenero());
        System.out.println("Ano: " + A1.getAno());
        System.out.println("Artista: " + A1.getArtista().getNome() + " (Idade: " + A1.getArtista().getIdade() + ")");
        System.out.println("Musica: " + A1.getMusica().getTitulo() + " (Duracao: " + A1.getMusica().getDuracao() + " minutos)");
    }
}