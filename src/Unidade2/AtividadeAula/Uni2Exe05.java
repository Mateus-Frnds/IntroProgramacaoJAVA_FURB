package Unidade2.AtividadeAula;
import java.util.Scanner;

// Leia quatro valores inteiros A, B, C e D. A seguir, 
// calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: 
// DIFERENCA = (A * B - C * D).

public class Uni2Exe05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b, c, d, diferenca;

        System.out.println("Insira o primeiro número:");
        a = scanner.nextInt();

        System.out.println("Insira o segundo número:");
        b = scanner.nextInt();

        System.out.println("Insira o terceiro número:");
        c = scanner.nextInt();

        System.out.println("Insira o quarto número:");
        d = scanner.nextInt();

        diferenca = (a * b) - (c * d);

        System.out.println("A diferença entre os produtos dos valores 1 e 2 por 3 e 4 é: " + diferenca);
        
        scanner.close();
    }
}
