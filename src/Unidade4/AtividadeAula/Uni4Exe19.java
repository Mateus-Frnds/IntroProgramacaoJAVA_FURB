package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("x = ");
        int x = scanner.nextInt();

        System.out.println("y = ");
        int y = scanner.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");

        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");

        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 2");

        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");

        } else {
            System.out.println("Quadrante 4");
            
        }

        scanner.close();
    }
}
