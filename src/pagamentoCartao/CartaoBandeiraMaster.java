package pagamentoCartao;

public class CartaoBandeiraMaster implements PagamentoCartao {
    @Override
    public void pagamentoDebito() {
        System.out.println("Debito");

    }

    @Override
    public void pagamentoCredito() {
        System.out.println("Credito");

    }
}
