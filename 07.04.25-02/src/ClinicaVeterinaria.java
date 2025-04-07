import java.util.ArrayList;
import java.util.Scanner;

public class ClinicaVeterinaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animais> filaAtendimento = new ArrayList<>();


        int opcao;
        do{
            System.out.println("\n--- Clínica Veterinária ---");
            System.out.println("Escolha um animal para atendimento:");
            System.out.println("1. Adicionar Cachorro");
            System.out.println("2. Adicionar Gato");
            System.out.println("3. Adicionar Peixe");
            System.out.println("4. Adicionar Lagarto");
            System.out.println("5. Adicionar Urso");
            System.out.println("6. Atender animais");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    filaAtendimento.add(new Cachorro());
                    System.out.println("Cachorro adicionado à fila!");
                    break;
                case 2:
                    filaAtendimento.add(new Gato());
                    System.out.println("Gato adicionado à fila!");
                    break;
                case 3:
                    filaAtendimento.add(new Peixe());
                    System.out.println("Peixe adicionado à fila!");
                    break;
                case 4:
                    filaAtendimento.add(new Lagarto());
                    System.out.println("Lagarto adicionado à fila!");
                    break;
                case 5:
                    filaAtendimento.add(new Urso());
                    System.out.println("Urso adicionado à fila!");
                    break;
                case 6:
                    System.out.println("\nAtendendo os animais:");
                    for (Animais a : filaAtendimento) {
                        a.som();
                    }
                    filaAtendimento.clear();
                    break;
                case 0:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }


        }while (opcao != 0);
        sc.close();
    }
}
