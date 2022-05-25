import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int numero = 1;
        String dentroMochila = "";
        String foraMochila = "";
        int somaDentro = 0;
        int somaFora = 0;

        System.out.println("Informe o tamanho M da mochila, inteiro e positivo: ");
        int M = entradas.nextInt();

        System.out.println("Informe o primeiro termo N, sendo um número positivo e inteiro: ");
        int N = entradas.nextInt();

        System.out.println("Informe o decremento K, também positivo e inteiro: ");
        int K = entradas.nextInt();

        while (N > 0) {
            System.out.println("Elementos a serem colocados na mochila: " + N);

            if (numero <= M) {
                dentroMochila = dentroMochila + N + " ";
                somaDentro += N;
            } else {
                foraMochila = foraMochila + N + " ";
                somaFora += N;
            }

            N -= K;
            numero++;
        }

        System.out.println("Os termos que entraram no mochila foram: " + dentroMochila
        + "\nOs elementos que ficaram fora da mochila foram: " + foraMochila
        + "\nSoma dos elementos que entraram na mochila: " + somaDentro
        + "\nSoma dos elementos que ficaram de fora da mochila: " + somaFora);

        entradas.close();
    }
}