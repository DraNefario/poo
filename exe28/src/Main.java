import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Restaurante restaurante = new Restaurante("Restaurante BCC");

        restaurante.adicionarPratoAoMenu(new Prato(1, "Lasanha", 35.0));
        restaurante.adicionarPratoAoMenu(new Prato(2, "Feijoada", 50.0));
        restaurante.adicionarPratoAoMenu(new Prato(3, "Pizza", 60.0));
        restaurante.adicionarPratoAoMenu(new Prato(4, "Hambúrguer", 25.0));
        restaurante.adicionarPratoAoMenu(new Prato(5, "Arroz", 20.0));
        restaurante.adicionarPratoAoMenu(new Prato(6, "Salada", 15.0));

        System.out.println("*** CADASTRAR CLIENTE ***");
        System.out.print("Nome: ");
        String nomeCliente = scanner.nextLine();
        System.out.print("Telefone: ");
        String telefoneCliente = scanner.nextLine();
        System.out.print("Endereco: ");
        String enderecoCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente, telefoneCliente, enderecoCliente);

        Pedido pedido = new Pedido(cliente);

        restaurante.listarPratos();

        boolean continuar = true;
        while (continuar) {
            System.out.print("\nDigite o código do prato desejado: ");
            int codigoPrato = scanner.nextInt();
            scanner.nextLine();
            Prato prato = restaurante.buscarPrato(codigoPrato);
            if (prato != null) {
                pedido.adicionarPrato(prato);
            } else {
                System.out.println("\nPrato não encontrado, tente novamente.");
            }

            pedido.exibirPedido();

            System.out.print("Deseja remover algum prato? (s/n): ");
            String resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase("s")) {
                pedido.exibirPedido();
                System.out.print("Digite a posição do prato a remover (1 a " + pedido.getPratos().size() + "): ");
                int posicaoPratoRemover = scanner.nextInt();
                scanner.nextLine();
                pedido.removerPratoPorPosicao(posicaoPratoRemover - 1); // Subtrai 1 para alinhar ao índice do ArrayList
                System.out.println("Pedido atualizado:");
                pedido.exibirPedido();
            }

            System.out.print("Deseja encerrar? (s/n): ");
            String respostaEncerrar = scanner.nextLine();
            if (respostaEncerrar.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        pedido.exibirPedido();
        scanner.close();
    }
}
