package aumentoDesconto;

public class Produto {

    private String descricao;
    private double valorReal;
    private String operacao;
    private double percentual;
    private double valorFinal;

    public Produto(String descricao, double valorReal, String operacao, double percentual) {
        this.descricao = descricao;
        this.valorReal = valorReal;
        this.operacao = operacao;
        this.percentual = percentual;
    }

    //metodo para aplicar o desconto ou o acrescimo e calcular o valor final
    public void calcularValorFinal(){
        if (operacao == "desconto") {
            valorFinal = valorReal * (1.00 - percentual);
        } else if (operacao == "acrescimo") {
            valorFinal = valorReal * (1.00 + percentual);
        }

        System.out.println("Valor final do produto: R$ " + valorFinal);
    }




}
