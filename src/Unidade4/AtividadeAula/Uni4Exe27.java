package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int horaEntrada = 0;
        int horaSaida = 0;
        int minutoEntrada = 0;
        int minutoSaida = 0;
        int horaTotal = 0;
        int minutoTotal = 0;
        float valorTotal = 0;

        System.out.println("Digite a hora de entrada: \n");
        horaEntrada = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite os minutos da hora de entrada: \n");
        minutoEntrada = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite a hora de saída: \n");
        horaSaida = Integer.parseInt(scanner.nextLine());

        System.out.println("Digite os minutos da hora de saída: \n");
        minutoSaida = Integer.parseInt(scanner.nextLine());

        if (horaEntrada > 24 || horaSaida > 24) {
            System.out.println("Digite apenas horas válidas\n");
        }

        if (minutoEntrada > 60 || minutoSaida > 60) {
            System.out.println("Digite apenas minutos válidos\n");
        }

        horaTotal = horaSaida - horaEntrada;

        if (horaEntrada > horaSaida) {
            horaTotal = horaTotal + 24;
        }

        minutoTotal = minutoSaida - minutoEntrada;

        if (minutoTotal > 30) {
            if (horaTotal == 0) {
                horaTotal = 1;
            } else {
                horaTotal++;
            }
        }

        switch (horaTotal) {
            
            case 1:
                valorTotal = 5;
                break;

            case 2:
                valorTotal = 10;
                break;

            case 3:
                valorTotal = 17.5f;
                break;

            case 4:
                valorTotal = 25;
                break;

            case 5:
                valorTotal = 30;
                break;

            default:
                valorTotal = 30 + (horaTotal - 5) * 5;
                break;
        }

        System.out.println("O valor da sua tarifa é de R$" + valorTotal);

        scanner.close();
    }
}
