public class FornecedorAdapter implements Computador {

    private FornecedorExterno fornecedor;

    public FornecedorAdapter(FornecedorExterno fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String getDescricao() {
        return fornecedor.descricaoProduto();
    }

    @Override
    public double getPreco() {
        return fornecedor.precoProduto();
    }
}