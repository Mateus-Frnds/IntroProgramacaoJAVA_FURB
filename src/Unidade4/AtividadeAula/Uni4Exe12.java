package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o comprimento do lado 1: ");
        double lado1 = scanner.nextDouble();

        System.out.println("Entre com o comprimento do lado 2: ");
        double lado2 = scanner.nextDouble();

        System.out.println("Entre com o comprimento do lado 3: ");
        double lado3 = scanner.nextDouble();

        if (lado1 > (lado2 + lado3) && lado2 > (lado1 + lado3) && lado3 > (lado1 + lado2)) {
            System.out.println("Não formam um triângulo.");

        } else if (lado1 == lado2 && lado1 == lado3) {
            System.out.println("É um triângulo equilátero.");

        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("É um triângulo isóceles.");
            
        } else {
            System.out.println("É um triângulo escaleno.");
        } 

        scanner.close();
    }
}
