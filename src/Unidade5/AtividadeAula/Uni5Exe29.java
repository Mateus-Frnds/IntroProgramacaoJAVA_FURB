import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int notas1 = 0; 
        int notas2 = 0;
        int notas5 = 0;
        int notas10 = 0;
        int notas20 = 0;

        System.out.println("Informe um valor: ");
        int valor = entradas.nextInt();

        while (valor != 0) {
            notas20 = valor / 20;
            valor %= 20;

            notas10 = valor / 10;
            valor %= 10;

            notas5 = valor / 5;
            valor %= 5;

            notas2 = valor / 2;
            valor %= 2;
            
            notas1 = valor / 1;
            valor %= 1;
        }

        System.out.println("Serão necessárias " + notas20 + " notas de 20 reais, "
         + notas10 + " notas de 10 reais, "
         + notas5 + " notas de 5 reais, "
         + notas2 + " notas de 2 reais e "
         + notas1 + " notas de 1 real.");

        entradas.close();
    }
}