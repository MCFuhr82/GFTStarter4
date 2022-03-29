package aumentoDesconto;

public class Application {
    public static void main(String[] args) {


    Produto p1 = new Produto("Camiseta", 20.00, "desconto", 0.20);
    Produto p2 = new Produto("Calca", 20.00, "acrescimo", 0.20);

    p1.calcularValorFinal();
    p2.calcularValorFinal();

    }
}
