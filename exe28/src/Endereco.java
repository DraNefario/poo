public class Endereco {
    private static String rua;
    private static int numero;
    private static String CEP;
    private static String bairro;

    public Endereco(String bairro, String rua, int numero, String CEP){
        Endereco.bairro = bairro;
        Endereco.rua = rua;
        Endereco.numero = numero;
        Endereco.CEP = CEP;
    }


    public static String getBairro() {
        return bairro;
    }

    public static void setBairro(String bairro) {
        Endereco.bairro = bairro;
    }

    public static String getRua() {
        return rua;
    }

    public static void setRua(String rua) {
        Endereco.rua = rua;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Endereco.numero = numero;
    }

    public static String getCEP() {
        return CEP;
    }

    public static void setCEP(String CEP) {
        Endereco.CEP = CEP;
    }
}
