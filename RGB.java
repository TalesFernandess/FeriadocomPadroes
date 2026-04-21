public class RGB extends ComputadorDecorator {
    
    public RGB(Computador computador) {
        super(computador);
    }

    @Override
    public String getDescricao() {
        return computador.getDescricao() + " + RGB";
    }

    @Override
    public double getPreco() {
        return computador.getPreco() + 150.0;
    }
}