package Unidade3.AtividadeAula;
import java.util.Scanner;

public class Uni3Exe01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura do terreno:");
        float largura = scanner.nextFloat();

        System.out.println("Digite a altura do terreno:");
        float altura = scanner.nextFloat();

        float area = (altura * largura);
        System.out.printf("A área do terreno é: " + area);

        scanner.close();
    }
}