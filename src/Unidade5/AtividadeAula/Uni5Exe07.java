import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Insira um número inteiro qualquer: ");
        int n = entradas.nextInt();

        System.out.println("Informe um número: ");
        double numero = entradas.nextDouble();

        double maiorNumero = numero;
        double menorNumero = numero;

        for (int contador = 0; contador < n; contador++) {
            System.out.println("Informe um número: ");
            numero = entradas.nextDouble();

            if (numero > maiorNumero) {
                maiorNumero = numero;
            } 

            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }

        System.out.println("Maior número: " + maiorNumero + "\nMenor número: " + menorNumero);

        entradas.close();
    }
}