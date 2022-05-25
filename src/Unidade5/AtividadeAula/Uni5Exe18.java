import java.util.Scanner;

public class Uni5Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int canal4 = 0;
        int canal5 = 0;
        int canal9 = 0;
        int canal12 = 0;

        System.out.println("Informe o canal que está sendo assistido (4, 5, 9 ou 12): ");
        int canal = entradas.nextInt();

        while (canal != 0) {

            System.out.println("Quantas pessoas estão assistindo o canal?");
            int quantidade = entradas.nextInt();

            switch (canal) {
                case 4: 
                    canal4 += quantidade;
                    break;

                case 5: 
                    canal5 += quantidade;
                    break;

                case 9: 
                    canal9 += quantidade;
                    break;

                case 12: 
                    canal12 += quantidade;
                    break;

                default:
                    System.out.println("Canal inválido");
            }

            System.out.println("Informe o canal que está sendo assistido (4, 5, 9 ou 12): ");
            canal = entradas.nextInt();
        }

        double total = canal4 + canal5 + canal9 + canal12;
        double percentualCanal4 = (canal4 / total) * 100;
        double percentualCanal5 = (canal5 / total) * 100;
        double percentualCanal9 = (canal9 / total) * 100;
        double percentualCanal12 = (canal12 / total) * 100;

        System.out.println("Percentual de audiência nos canais:" 
                        + "\nCanal 4: " + percentualCanal4
                        + "\nCanal 5: " + percentualCanal5
                        + "\nCanal 9: " + percentualCanal9
                        + "\nCanal 12: " + percentualCanal12);

        entradas.close();
    }
}