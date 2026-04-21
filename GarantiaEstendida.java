public class GarantiaEstendida extends ComputadorDecorator {

    public GarantiaEstendida(Computador computador) {
        super(computador);
    }

    @Override
    public String getDescricao() {
        return computador.getDescricao() + " + Garantia Estendida";
    }

    @Override
    public double getPreco() {
        return computador.getPreco() + 300.0;
    }
}