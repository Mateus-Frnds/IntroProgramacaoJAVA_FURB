import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        double vetor[] = new double[12];
        double soma = 0;

        for (int posicao = 0; posicao < 12; posicao++) {
            System.out.println("Informe um valor[" + posicao + "]: ");
            vetor[posicao] = entradas.nextDouble();

            soma += vetor[posicao];
        }

        double media = (soma / 12);

        System.out.println("Média: " + media);

        for (int i = 0; i < 12; i++) {
            if (vetor[i] > media) {
                System.out.println(vetor[i] + "\t");
            }
        }

        entradas.close();
    }
}
