public class ComputadorBase implements Computador{

    @Override
    public String getDescricao() {
        return "Computador básico";
    }

    @Override
    public double getPreco() {
        return 1000.0;
    }
}