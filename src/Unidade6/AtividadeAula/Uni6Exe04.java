import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10];

        for (int i = 0; i <= 9; i++) {
            System.out.println("Informe os valores do primeiro vetor: ");
            vetor1[i] = entradas.nextInt();
        
            System.out.println("Informe os valores do segundo vetor: ");
            vetor2[i] = entradas.nextInt();
        }

        for (int j = 0; j <= 9; j++) {
            vetor3[j] = vetor1[j] + vetor2[j];
        }
        
        for (int k = 0; k <= 9; k++) {
            System.out.println("Vetor 1 = " + k + " - " + vetor1[k] + "\t" 
            + "\nVetor 2 = " + k + " - " + vetor2[k] + "\t"
            + "\nVetor 3 = " + k + " - " + vetor3[k] + "\t");
        }
 
        entradas.close();
    }
}

/** Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 
 * 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos valores 
 * contidos nas posições respectivas dos vetores originais. 
 * 
 * Por exemplo, vetor1 = 
 * [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. 
 * Faça três métodos: um método para ler valores dos vetores, outro para somar e outro 
 * para escrever os vetores. */