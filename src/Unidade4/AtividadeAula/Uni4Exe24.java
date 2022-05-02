package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Informe o primeiro número, maior que os outros: ");
        int numero1 = scanner.nextInt();

        System.out.println("Informe o segundo número, menor que o primeiro: ");
        int numero2 = scanner.nextInt();

        System.out.println("Informe o terceiro número, menor : ");
        int numero3 = scanner.nextInt();

        System.out.println("Escolha uma das três opções: \n opção = 1, escreva os 3 valores em ordem crescente \n se opção = 2, escreva os 3 valores em ordem decrescente \n se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio" );
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1: 
            System.out.println(numero1 + ", " + numero2 + ", " + numero3);
            break;

            case 2:
            System.out.println(numero3 + ", " + numero2 + ", " + numero1);
            break;

            case 3:
            System.out.println(numero2 + ", " + numero1 + ", " + numero3);
            break;
        }

        scanner.close();
    }
}