package Unidade3.AtividadeURI;
import java.util.Scanner;

public class Uri1009 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome = scanner.nextLine();
        double salario = scanner.nextDouble();
        double venda = scanner.nextDouble();

        double percentvendas = venda * 0.15;
        double total = percentvendas + salario;

        System.out.printf("TOTAL = R$ %.2f%n", total);

        scanner.close();
        
    }
}
