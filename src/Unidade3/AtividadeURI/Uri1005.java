package Unidade3.AtividadeURI;
import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        double media = (float) (((a * 3.5) + (b * 7.5)) /11);
        System.out.printf("MEDIA = %.5f%n", media);

        scanner.close();
    }
    
}
