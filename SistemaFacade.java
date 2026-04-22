public class SistemaFacade {

    public Computador montarPCBasico() {
        Computador pc = ComputadorFactory.criar("basico");
        pc = new ComputadorProxy(pc);
        return pc;
    }

    public Computador montarPCGamer() {
        Computador pc = ComputadorFactory.criar("gamer");
        pc = new ComputadorProxy(pc);
        return pc;
    }

    public Computador montarPCPremium() {
        Computador pc = ComputadorFactory.criar("premium");
        pc = new ComputadorProxy(pc);
        return pc;
    }
}