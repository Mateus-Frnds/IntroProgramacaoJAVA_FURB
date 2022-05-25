import java.util.Scanner;

public class Uni5Exe20 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int contadorTempo = 0;

        System.out.println("Determinar o tempo necessário para que o material" 
        + " radioativo pese menos do que 0,5g.\nInforme a massa inicial do material,"
        + " em quilogramas: ");
        double massaInicial = entradas.nextDouble();

        double massaFinal = massaInicial;

        while (massaFinal > 0.0005) {
            contadorTempo += 50;

            massaFinal = massaFinal / 2;
        }

        System.out.println("Massa inicial: " + massaInicial + "kg."
        + "\nMassa final: " + massaFinal + "kg."
        + "\nO tempo necessário para que o material chegue a menos de" 
        + " 0,5g é: " + contadorTempo + " segundos.");

        entradas.close();
    }
}