package Unidade3.AtividadeURI;
import java.util.Scanner;

public class Uri1015 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float x1, y1, x2, y2, total;
        double resultado;

        x1 = scanner.nextFloat();
        y1 = scanner.nextFloat();
        x2 = scanner.nextFloat();
        y2 = scanner.nextFloat();

        total =  (((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1)));
        resultado = Math.sqrt(total);

        System.out.printf("%.4f%n", resultado);

        scanner.close();
    
    }
    
}
