import java.util.Scanner;

import javax.sound.midi.Soundbank;

/** Descreva um algoritmo que escreva os n primeiros termos da seguinte sequência de números:

8 10 16 18 32 34 64 ...

O valor n deve ser lido e deve ser maior do que 2.

 */

public class Uni5Exe05 {
    public static void main(String[] args) throws Exception {
       Scanner entradas = new Scanner(System.in);

       System.out.println("Informe um número inteiro qualquer: ");
       int n = entradas.nextInt();

       int auxiliar = 0;
       int a = 4;

       if (n > 2) {
        for (int contador = 0; contador < n; contador++) {
            if (contador % 2 == 1 && contador != 0) {
                auxiliar = a + 2;
                System.out.println(auxiliar);
            } else {
                a *= 2;
                System.out.println(a);
            } 
        }
       } else {
           System.out.println("Valor inválido");
       }

       entradas.close();
    }
}
