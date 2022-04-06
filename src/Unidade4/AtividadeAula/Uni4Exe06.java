package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite M, F, I ");
        String letra = scanner.nextLine();

        letra = letra.toUpperCase();
        char letraChar = letra.trim().charAt(0);

        if (letraChar == 'M') {
            System.out.println("Masculino");

        } else if (letraChar == 'F') {
            System.out.println("Feminino");

        } else if (letraChar == '1') {
            System.out.println("Não Informado");

        } else {
            System.out.println("Entrada Incorreta");

        }

        scanner.close();
        
    }
}
