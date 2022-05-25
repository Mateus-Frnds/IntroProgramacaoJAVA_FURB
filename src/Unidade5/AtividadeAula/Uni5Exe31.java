import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int fator = 2;

        System.out.println("Determinar a decomposição em fatores primos de um "
        + "determinado número.\nInforme um número inteiro e positivo, maior do que 1: ");
        int numero = entradas.nextInt();

/** while (n % fator == 0) 
        {
          mult ++;
          n = n / fator; 
        } */

        while (numero > 1) {
            while (numero % fator == 0) {
                System.out.println(numero + "\t|\t" + fator);
                numero = Math.floorDiv(numero, fator);
            }

            if (numero % fator == 1) {
                System.out.println(numero + "\t|\t");
            }

            fator++;
        }

        entradas.close();
    }
}

/** Dado um número inteiro positivo, determine a sua decomposição em fatores primos. 
 * A saída do programa deve ser semelhante ao exemplo abaixo: */