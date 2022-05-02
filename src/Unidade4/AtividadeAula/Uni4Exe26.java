package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe26 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:\n opção T\n opção Q\n opção R\n opção C");
        char opcao = Character.toUpperCase((scanner.next().charAt(0)));

        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e a altura do triângulo: ");
                double baseT = scanner.nextDouble();
                double alturaT = scanner.nextDouble();

                System.out.println("Área do triângulo: " + baseT * alturaT / 2);
                break;

            case 'Q':
                System.out.println("Digite o lado do quadrado: ");
                double ladoQ = scanner.nextDouble();

                System.out.println("Área do quadrado: " + ladoQ * ladoQ);
                break;

            case 'R':
                System.out.println("Digite a base e a altura do retângulo: ");
                double baseR = scanner.nextDouble();
                double alturaR = scanner.nextDouble();

                System.out.println("Área do retângulo: " + baseR * alturaR);
                break;

            case 'C':
                System.out.println("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();

                System.out.println("Área do círculo: " + Math.PI * Math.pow(raio, 2));
        }
        scanner.close();
    }
}
