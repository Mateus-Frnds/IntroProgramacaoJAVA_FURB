package Unidade3.AtividadeURI;
import java.util.Scanner;

public class Uri1012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a, b, c, triangulo, circulo, trapezio,
        quadrado, retangulo;

        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        //a = base, c altura, b hipotenusa;
        triangulo = (a * c) / 2;
        circulo = (c * c) * 3.14159;
        trapezio = ((a + b) * c) / 2;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f%n", triangulo);
        System.out.printf("CIRCULO: %.3f%n", circulo);
        System.out.printf("TRAPEZIO: %.3f%n", trapezio);
        System.out.printf("QUADRADO: %.3f%n", quadrado);
        System.out.printf("RETANGULO: %.3f%n", retangulo);

        scanner.close();

    }
}
