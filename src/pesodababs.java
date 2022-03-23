import java.util.Scanner;

public class pesodababs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peso, altura, idade;

        System.out.println("Informe seu peso");
        peso = scanner.nextInt();
        System.out.println("Informe sua altura");
        altura = scanner.nextInt();
        System.out.println("Informe sua idade");
        idade = scanner.nextInt();

        double calorias = (665 + (9.6 * peso) + (1.8 + altura) - (4.7 * idade)); 
        System.out.println("Você deve consumir " + calorias + "kcal por dia para se manter no seu peso");

        scanner.close();

    }
    
}