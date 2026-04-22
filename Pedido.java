import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Observer> observers = new ArrayList<>();

    public void adicionarObserver(Observer o) {
        observers.add(o);
    }

    public void notificar(String msg) {
        for (Observer o : observers) {
            o.atualizar(msg);
        }
    }

    public void realizarPedido(Computador pc) {
        System.out.println("Pedido realizado: " + pc.getDescricao());
        notificar("Novo pedido: " + pc.getDescricao());
    }
}