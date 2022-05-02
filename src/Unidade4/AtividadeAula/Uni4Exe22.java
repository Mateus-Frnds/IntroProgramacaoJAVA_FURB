package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Insira a sua opção de curso: ");
        int curso = scanner.nextInt();

        switch (curso) {
            case 1: 
            System.out.println("Bacharel em Ciência da Computação.");
            break;

            case 2: 
            System.out.println("Licenciado em Computação.");
            break;

            case 3:
            System.out.println("Bacharel em Sistemas de Informação.");
            break;
        }

        scanner.close();
    }
}
