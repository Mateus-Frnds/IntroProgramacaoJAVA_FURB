package Unidade3.AtividadeURI;
import java.util.Scanner;

public class Uri1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cod1, valor1, cod2, valor2;
        double preco1, preco2;

        cod1 = scanner.nextInt();
        valor1 = scanner.nextInt();
        preco1 = scanner.nextDouble();

        cod2 = scanner.nextInt();
        valor2 = scanner.nextInt();
        preco2 = scanner.nextDouble();

        double compra1 = valor1 * preco1;
        double compra2 = valor2 * preco2;

        double total = compra1 + compra2;

        //variaveis 'cod1' e 'cod2' adicionadas pq meu toc n permite deixar a classe amarela no vscode
        System.out.printf(cod1 + cod2 + "VALOR A PAGAR: R$ %.2f%n", total);

        scanner.close();
    }
}
