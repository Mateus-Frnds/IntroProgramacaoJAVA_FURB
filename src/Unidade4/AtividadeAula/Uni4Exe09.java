package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor inteiro qualquer: ");
        int valor1 = scanner.nextInt();

        System.out.println("Informe outro valor inteiro qualquer: ");
        int valor2 = scanner.nextInt();

        if (valor1 % valor2 == 0 || valor2 % valor1 == 0) {
            System.out.println("Os números são múltiplos.");
            
        } else {
            System.out.println("Os números não são múltiplos.");
        }

        scanner.close();
    }
}
