package Unidade2.AtividadeAula;
import java.util.Scanner;

// Leia 2 valores inteiros e imprima sua soma.

public class Uni2Exe01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número:");
        int a = scanner.nextInt();
        System.out.println("Insira outro número:");
        int b = scanner.nextInt();

        int soma = a + b;
        System.out.println("O resultado é: " + soma);

        scanner.close();

    }
    
}
