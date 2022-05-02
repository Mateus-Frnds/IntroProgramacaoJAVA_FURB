package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um valor maior que 0: ");
        double valor = scanner.nextDouble();

        if (valor != (int) valor) {
            System.out.println("O valor possui ponto flutuante.");

        } else {
            System.out.println("O valor não possui ponto flutuante.");
            
        }

        scanner.close();
    }
    
}
