import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe um número inteiro: ");
            numeros[i] = entradas.nextInt();
        }


        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.println("Índice: " + i + " Valor: " + numeros[i]);
        }

        entradas.close();
    }
}

/** Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. 
 * Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever. */