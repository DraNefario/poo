public class Main {
    public static void main(String[] args) {
        Restaurante r1 = new Restaurante("Pamphylia", "italiana", "1245", "macarrao");

        Pessoa chef = new Pessoa("Antonio", "23/10/1957", "130.004.234-01");
        r1.setChef(chef);

        System.out.println("*****RESTAURANTE*****");
        System.out.println("Nome: " + r1.getNome());
        System.out.println("Nome do Chef: " + r1.getChef().getNome());
        System.out.println("Culinaria: " + r1.getCulinaria());
        System.out.println("CNPJ: " + r1.getCNPJ());

    }
}