package Unidade4.AtividadeURI;
import java.util.Scanner;

public class Uri1046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int horaInicial = scanner.nextInt();
        int horaFinal = scanner.nextInt();

        if (horaInicial > horaFinal) {
            System.out.println("O JOGO DUROU " + (24 - (horaInicial - horaFinal)) + " HORA(S)");

        } else if (horaFinal > horaInicial) {
            System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S)");

        } else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        scanner.close();
    }

}
