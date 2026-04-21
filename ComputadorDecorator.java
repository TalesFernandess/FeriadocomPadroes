public abstract class ComputadorDecorator implements Computador {
    protected Computador computador;

    public ComputadorDecorator(Computador computador) {
        this.computador = computador;
    }
}