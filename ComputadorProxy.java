public class ComputadorProxy implements Computador {

    private Computador real;

    public ComputadorProxy(Computador real) {
        this.real = real;
    }

    @Override
    public String getDescricao() {
        return real.getDescricao();
    }

    @Override
    public double getPreco() {

        Configuracao config = Configuracao.getInstance();

        double preco = real.getPreco();

        if (preco > config.getOrcamentoMaximo()) {
            System.out.println("Orçamento excedido.");
            return 0;
        }

        System.out.println("Compra dentro do orçamento.");

        return preco + config.getTaxaMontagem();
    }
}