public class EstoqueObserver implements Observer {

    @Override
    public void atualizar(String mensagem) {
        System.out.println("Atualizando estoque...");
    }
}