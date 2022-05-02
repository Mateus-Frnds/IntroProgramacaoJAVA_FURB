package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a letra: ");
        char letra = Character.toLowerCase(scanner.next().charAt(0));

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            System.out.println("É vogal.");
            
        } else {
            System.out.println("Não é vogal.");
        }

        scanner.close();
    }
}
