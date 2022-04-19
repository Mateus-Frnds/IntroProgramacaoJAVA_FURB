package Unidade4.AtividadeURI;
import java.util.Scanner;

public class Uri1035 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();

        if (B > C && D > A && C > 0 && D > 0 && (C + D) > (A + B)
                && A % 2 == 0) {
            System.out.println("Valores aceitos");

        } else {
            System.out.println("Valores não aceitos");
        }
        scanner.close();
    }

}