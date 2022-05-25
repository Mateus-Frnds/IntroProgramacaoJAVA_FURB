import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        float valorPedagio = 1;
        float distanciaTrecho = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;

        System.out.println("Informe o valor limite que Astolfo pode pagar: ");
        float valorLimite = entradas.nextFloat();

        while (valorPedagio > 0) {
            System.out.println("Informe o custo do pedágio: ");
            valorPedagio = entradas.nextFloat();

            System.out.println("Informe a distância do trecho (em km): ");
            distanciaTrecho = entradas.nextFloat();

            if (valorPedagio > 0) {
                contador1 += 1;
            }

            if (valorPedagio > valorLimite) {
                contador2 += 1;
            } else {
                contador2 += 0;
            }

            if (distanciaTrecho > 150 && valorPedagio < valorLimite) {
                contador3 += 1;
            } else {
                contador3 += 0;
            }
        }

        System.out.println("A quantidade de trechos que Astolfo se nega a pagar é: " + contador2
        + "\nForam informados " + contador1 + " trechos."
        + "\nA quantidade de trechos acima de 150km que Astolfo concorda em pagar é: " + contador3);

        entradas.close();
    }
}
