package Unidade2.AtividadeAula;
import java.util.Scanner;

// Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a note A 
// tem peso 3.5 e nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.

public class Uni2Exe04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, media;
         
        System.out.println("Insira a primeira nota: ");
        nota1 = scanner.nextFloat();
         
        System.out.println("Insira a segunda nota: ");
        nota2 = scanner.nextFloat();
         
        media = (float) (((nota1 * 3.5) + (nota2 * 7.5)) /11);
 
        System.out.printf("A media do aluno e: %2.2f", media);

        scanner.close();
    
    }
}