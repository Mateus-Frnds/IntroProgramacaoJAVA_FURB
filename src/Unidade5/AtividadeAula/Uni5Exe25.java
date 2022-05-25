import java.util.Scanner;

public class Uni5Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);
        
        System.out.println("Informe se o jogador D pontuou (1 para sim e 0 para não): ");
        int pontosD = entradas.nextInt();

        System.out.println("Informe se o jogador E pontuou (1 para sim e 0 para não): ");
        int pontosE = entradas.nextInt();

        int vencedor = 0;

        while (pontosD < 21 && pontosE < 21) {
            vencedor = pontosD - pontosE;

            System.out.println("Informe se o jogador D pontuou (1 para sim e 0 para não): ");
            pontosD += entradas.nextInt();

            System.out.println("Informe se o jogador E pontuou (1 para sim e 0 para não): ");
            pontosE += entradas.nextInt();
        }

        if (vencedor >= 2) {
            System.out.println("O vencedor foi o lado direito");
        } else if (vencedor <= -2) {
            System.out.println("O vencedor foi o lado esquerdo");
        }

        entradas.close();
    }
}