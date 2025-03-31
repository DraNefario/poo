public class Main {
    public static void main(String[] args) {
        Gato G1 = new Gato("Rabo curto", "preto", 8, 10.4, "rua");
        Cachorro C1 = new Cachorro("newton", 5, 4.5, "Spitz", "pequeno");

        System.out.println();

        G1.exibirInformacoes();
        G1.imprimirInformacoes();
        G1.aranhar();
        G1.miando();
        G1.comer();
        G1.dormir();


        System.out.println();

        C1.exibirInformacoes();
        C1.imprimirInformacoes();
        C1.latir();
        C1.comer();
        C1.dormir();

    }
}