package Avaliacoes.Avaliacao01;
import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi o horário de entrada no estacionamento?");
        int horaentrada = scanner.nextInt();
        int minutoentrada = scanner.nextInt();

        System.out.println("Qual foi o horário de saída no estacionamento?");
        int horasaida = scanner.nextInt();
        int minutosaida = scanner.nextInt();

        double horas = (horasaida - horaentrada);
        double minutos = (minutosaida - minutoentrada);

            if (minutos <= 29 & horas <= 1){
                double horastotal = horas * 2.50;
                System.out.println(horastotal);

            }

            if (minutos <= 29 & horas == 2){
                double horastotal = horas * 5;
                System.out.println(horastotal);

            }

            if (minutos <= 29 & horas == 3){
                double horastotal = horas * 5;
                System.out.println(horastotal);

            }

            if (minutos <= 29 & horas >= 4) {
                double horastotal = horas * 9;
                System.out.println(horastotal);
                
            }

            else if (minutos >= 30) {
                horas = horas + 1; 
                
            }

            scanner.close();

    }

}
