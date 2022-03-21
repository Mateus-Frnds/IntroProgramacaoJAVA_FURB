package Unidade2;
import java.util.Scanner;

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