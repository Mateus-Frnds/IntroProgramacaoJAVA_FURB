package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a idade de Marquinhos: ");
        int idadeMarquinhos = scanner.nextInt();

        System.out.println("Informe a idade de Zezinho: ");
        int idadeZezinho = scanner.nextInt();

        System.out.println("Informe a idade de Luluzinha: ");
        int idadeLuluzinha = scanner.nextInt();

        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.println("Marquinhos é o caçula.");

        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.println("Zezinho é o caçula.");

        } else {
            System.out.println("Luluzinha é a caçula.");

        }

        scanner.close();
    }
}
