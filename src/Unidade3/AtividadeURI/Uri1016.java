package Unidade3.AtividadeURI;
import java.util.Scanner;

public class Uri1016 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int km = scanner.nextInt();
        int minutos = (60 * km) / 30;
        System.out.println(minutos + " minutos"); 

        scanner.close();

    }
    
}
