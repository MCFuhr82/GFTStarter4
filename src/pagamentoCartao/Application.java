package pagamentoCartao;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        CartaoBandeiraVisa pagamentoVisa = new CartaoBandeiraVisa();
        CartaoBandeiraMaster pagamentoMaster = new CartaoBandeiraMaster();

        System.out.println("Digite o numero da bandeira do cartao? ");
        System.out.println("1 - Visa");
        System.out.println("2 - Master");
        int cartao = sc.nextInt();

        System.out.println("Credito ou Debito? ");
        System.out.println("1 - Credito");
        System.out.println("2 - Debito");
        int modalidade = sc.nextInt();

        if (cartao == 1) {
            System.out.println("Pago com Visa");
            if (modalidade == 1) {
                pagamentoVisa.pagamentoCredito();
            } else {
                pagamentoVisa.pagamentoDebito();
            }
        } else if (cartao == 2) {
            System.out.println("Pago com Master");
            if (modalidade == 1) {
                pagamentoMaster.pagamentoCredito();
            } else {
                pagamentoMaster.pagamentoDebito();
            }
        }

    }
}
