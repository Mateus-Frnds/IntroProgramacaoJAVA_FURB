package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu peso, em quilogramas: ");
        double peso = scanner.nextDouble();

        System.out.println("Informe a sua altura, em metros: ");
        double altura = scanner.nextDouble();

        double IMC = peso / (altura * altura);

        if (IMC < 18.5) {
            System.out.println("Classificação: Magreza");

        } else if (IMC <= 24.9 && IMC >= 18.5) {
            System.out.println("Classificação: Saudável");

        } else if (IMC <= 29.9 && IMC >= 25.0) {
            System.out.println("Classificação: Sobrepeso");

        } else if (IMC <= 34.9 && IMC >= 30.0) {
            System.out.println("Classificação: Obesidade Grau I");

        } else if (IMC <= 39.9 && IMC >= 35.0) {
            System.out.println("Classificação: Obesidade Grau II (severa)");

        } else {
            System.out.println("Classificação: Obesidade Grau III (mórbida)");

        }

        scanner.close();
    }
}
