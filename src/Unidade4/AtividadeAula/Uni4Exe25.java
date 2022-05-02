package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe dois números, diferentes de 0: ");
        double numero1 = scanner.nextDouble();
        double numero2 = scanner.nextDouble();

        System.out.println("Selecione a opção que deseja: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                double soma = numero1 + numero2;
                System.out.println(soma);
                break;

            case 2:
                double dif = numero1 - numero2;
                System.out.println(dif);
                break;

            case 3:
                double produto = numero1 * numero2;
                System.out.println(produto);
                break;

            case 4:
                double divisao = numero1 / numero2;
                System.out.println(divisao);
                break;
        }

        scanner.close();
    }
}
