package Unidade3.AtividadeAula;
import java.util.Scanner;

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o primeiro valor para a média ponderada");
        double nota1 = scanner.nextDouble();

        System.out.println("Insira o segundo valor para a média ponderada");
        double nota2 = scanner.nextDouble();

        System.out.println("Insira o terceiro valor para a média ponderada");
        double nota3 = scanner.nextDouble();

        double media = (float) (((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) /10);
        System.out.printf("A media ponderada é: %.2f%n", media);

        scanner.close();

    }  
}
