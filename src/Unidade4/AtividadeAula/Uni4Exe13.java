package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe13 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe as três cartas: ");
        int carta1 = scanner.nextInt();
        int carta2 = scanner.nextInt();
        int carta3 = scanner.nextInt();

        int qtdCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qtdCartasBoas = qtdCartasBoas + 1;

        } if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qtdCartasBoas = qtdCartasBoas + 1;

        } if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qtdCartasBoas = qtdCartasBoas + 1;

        } 
        
        if (qtdCartasBoas == 1) {
            System.out.println("TRUCO");

        } else if (qtdCartasBoas == 2) {
            System.out.println("SEIS");

        } else if (qtdCartasBoas == 3) {
            System.out.println("NOVE");
            
        }

        scanner.close();
    }
}
