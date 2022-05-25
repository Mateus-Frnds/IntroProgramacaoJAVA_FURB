import java.util.Scanner;

public class Uni5Exe24 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        float somaTotal = 0;

        System.out.println("Determinar o peso total de peixes pescados em um dia."
                + "\nPrimeiramente, informe o peso limite: ");
        float pesoLimite = entradas.nextFloat();
        
            while (somaTotal < pesoLimite) {
            System.out.println("Deseja informar o peso dos peixes? Digite s caso SIM ou"
            + " n caso NÃO");
            char cadastrarPeixe = entradas.next().charAt(0);

                while (cadastrarPeixe == 's' && somaTotal < pesoLimite) {
                    System.out.println("Informe o peso do peixe: ");
                    float pesoPeixe = entradas.nextFloat();

                    somaTotal += pesoPeixe;
                    System.out.println("Total obtido até agora: " + somaTotal + "kg.");

                    System.out.println("Deseja informar o peso de mais um peixe? Digite"
                            + " s caso SIM ou n caso NÃO");
                    cadastrarPeixe = entradas.next().charAt(0);
                }
            }

            System.out.println("Limite excedido.");

        entradas.close();
    }
}