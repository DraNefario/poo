public final class Utilitarios {

    private Utilitarios() {}

    public static boolean validarCPF(String cpf) {
        if (cpf == null || !cpf.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            return false;
        }
        return true;
    }

    public static boolean validarCEP(String cep) {
        if(cep == null || !cep.matches("\\d{5}-\\d{3}")) {
            return false;
        }
        return true;
    }
}
