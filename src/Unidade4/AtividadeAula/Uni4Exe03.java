package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro:");
        int valor1 = scanner.nextInt();

        System.out.println("Entre com outro valor inteiro:");
        int valor2 = scanner.nextInt();

        if (valor1 > valor2){
            System.out.println("O número " + valor1 + " é maior");
        }

        else if (valor2 > valor1){
            System.out.println("O número " + valor2 + " é maior");
        }

        else {
            System.out.println("Os números são iguais");
        }

        scanner.close();
    }
    
}
