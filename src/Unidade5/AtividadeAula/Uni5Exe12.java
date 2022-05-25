import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Insira um número inteiro positivo qualquer: ");
        int n = entradas.nextInt();

        int i, j, numero = 1;

        if (n < 0) {
        System.out.println("Número inválido! Insira um número positivo.");
        } else if (n > 0) {
            System.out.println("Para n = " + n + "\n");
            for (i = 1; i <= n; i++) {
                for (j = 1; j <= i; j++) {
                    System.out.print("\t" + numero);
                    numero++;
                }
                System.out.println();
            }
        }

        entradas.close();
    }
}