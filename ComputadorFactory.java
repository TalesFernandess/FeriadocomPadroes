public class ComputadorFactory {
    
    public static Computador criar(String tipo){

        if (tipo.equalsIgnoreCase("base")) {
            return new ComputadorBase();
        }
        else if (tipo.equalsIgnoreCase("gamer")) {
            Computador pc = new ComputadorBase();
            pc = new RGB(pc);
            return pc;
        }
        else if (tipo.equalsIgnoreCase("premium")){
            Computador pc = new ComputadorBase();
            pc = new RGB(pc);
            pc = new GarantiaEstendida(pc);
            return pc;
        }

        throw new IllegalArgumentException("Tipo Inválido");
    }
}