package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com um valor inteiro menor que 0: ");
        int valor = scanner.nextInt();

        if (valor % 2 == 0){
            System.out.println("Número é par");
        }
        
        else {
            System.out.println("Número é Impar");
        }

        scanner.close();

    }  
}
