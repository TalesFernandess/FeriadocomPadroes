public class Main {
    public static void main(String[] args) {

        SistemaFacade sistema = new SistemaFacade();

        Computador pc = sistema.montarPCGamer();

        Pedido pedido = new Pedido();

        pedido.adicionarObserver(new LoggerObserver());
        pedido.adicionarObserver(new EstoqueObserver());

        pedido.realizarPedido(pc);

        System.out.println("\nResumo do pedido:");
        System.out.println(pc.getDescricao());
        System.out.println("Preço final: " + pc.getPreco());
    }
}
