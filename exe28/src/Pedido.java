import java.util.ArrayList;

public class Pedido {
    private Cliente cliente;
    private ArrayList<Prato> pratos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.pratos = new ArrayList<>();
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Prato> getPratos() {
        return pratos;
    }

    public void setPratos(ArrayList<Prato> pratos) {
        this.pratos = pratos;
    }

    public void adicionarPrato(Prato prato) {
        pratos.add(prato);
    }

    // Remove o prato com base na posição
    public void removerPratoPorPosicao(int posicao) {
        if (posicao >= 0 && posicao < pratos.size()) {
            pratos.remove(posicao);
            System.out.println("Prato removido com sucesso!");
        } else {
            System.out.println("Posição inválida. Tente novamente.");
        }
    }

    public void exibirPedido() {
        System.out.println("\n*** PEDIDO DO CLIENTE ***");
        cliente.exibirDados();
        System.out.println("Pratos escolhidos:");
        double total = 0;

        for (int i = 0; i < pratos.size(); i++) {
            System.out.println((i + 1) + " - ");
            pratos.get(i).exibirDetalhes();
            total += pratos.get(i).getPreco();
        }

        System.out.println("Total do Pedido: R$ " + total + "\n");
    }
}
