package Unidade3.AtividadeURI;
import java.util.Scanner;

public class Uri1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n, horas, minutos, segundos;
        n = scanner.nextInt();

        horas = n / 3600;
		minutos = (n % 3600) / 60;
		segundos = (n % 3600) % 60;

		System.out.println(horas + ":" + minutos + ":" + segundos);

        scanner.close();

    }
    
}
