package valoresEmVetor;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seu vetor tera quantos numeros inteiros? ");
        int n = sc.nextInt();

        int[] vetorDeInteiros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero para adicionar ao vetor:");
            int numeroParaAdicionar = sc.nextInt();

            //comparando o numero a adicionar com os numeros dentro dos vetores
            boolean numeroTemNoVetor = (IntStream.of(vetorDeInteiros).anyMatch(x -> x == numeroParaAdicionar));

            // se o primeiro numero for 0, deixa adicionar
            if(i == 0 && numeroParaAdicionar == 0) {
                vetorDeInteiros[i] = numeroParaAdicionar;
            } else { //testando se o numero já existe no vetor
                if (!numeroTemNoVetor) {
                    vetorDeInteiros[i] = numeroParaAdicionar;
                } else {
                    System.out.println("Numero repetido, digite outro!!");
                    i--;
                }
            }
        }

        Arrays.sort(vetorDeInteiros);

        for (int numero: vetorDeInteiros) {
            System.out.print(numero + " ");
        }

    }
}
