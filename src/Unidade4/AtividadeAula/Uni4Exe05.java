package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("A cor é azul?");
        boolean cor = scanner.nextBoolean();

        if (cor) {
            System.out.println("Sim.");

        } else {
            System.out.println("Não.");
        }

        scanner.close();
    }
}
