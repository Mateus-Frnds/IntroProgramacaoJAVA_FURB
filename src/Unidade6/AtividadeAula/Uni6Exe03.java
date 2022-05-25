import java.util.Scanner;

public class Uni6Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        double valores[] = new double[12];

        for (int i = 0; i <= 11; i++) {
            System.out.println("Informe os valores do vetor: ");
            valores[i] = entradas.nextDouble();
        }

        for (int j = 0; j <= 11; j++) {
            if (j % 2 == 0) {
                valores[j] += (valores[j] * 0.02); 
            } else if (j % 2 == 1) {
                valores[j] += (valores[j] * 0.05);
            }
        }

        for (int k = 0; k <= 11; k++) {
            System.out.println(k + " - " + valores[k] + "\t");
        }

        entradas.close();
    }
}