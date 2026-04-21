public class Configuracao {

    private static Configuracao instancia;

    private double orcamentoMaximo;
    private double taxaMontagem;

    private Configuracao() {
        this.orcamentoMaximo = 10000.0;
        this.taxaMontagem = 200.0;
    }

    public static Configuracao getInstance() {
        if (instancia == null) {
            instancia = new Configuracao();
        }
        return instancia;
    }

    public double getOrcamentoMaximo() {
        return orcamentoMaximo;
    }

    public double getTaxaMontagem() {
        return taxaMontagem;
    }
}