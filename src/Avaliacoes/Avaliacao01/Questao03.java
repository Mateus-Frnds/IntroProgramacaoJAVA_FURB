package Avaliacoes.Avaliacao01;
import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu tipo sanguíneo: ");
        char tiposanguineo = Character.toUpperCase(scanner.next().charAt(0));

        if (tiposanguineo == 'A') {
            System.out.println("Vermelho");

        } else if (tiposanguineo == 'B') {
            System.out.println("Azul");

        } else if (tiposanguineo == 'O') {
            System.out.println("Universal");

        } else {
            System.out.println("Tipo Inconsistente");

        }

        scanner.close();
    }
    
}
