package Unidade2.AtividadeAula;
import java.util.Scanner;

public class Uni2Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do raio da circunferência:");
        double raio = scanner.nextDouble();

        double cfr = (raio * raio) * 3.14159;

        System.out.println("O valor da área da circunferência é: "
        + cfr);

        scanner.close();

    }
    
}
