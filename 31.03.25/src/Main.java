public class Main {
    public static void main(String[] args) {
        ImovelNovo I1 = new ImovelNovo("rua acacio correa", 100000);
        ImovelVelho IM1 = new ImovelVelho("rua acacio correa", 100000);
        Imovel IMO1 = new Imovel("rua acacio correa", 100000);

        IMO1.exibirInformacoes();
        IM1.exibirInformcoesAdicionais();
        I1.exibirInformcoesAdicionais();
    }
}