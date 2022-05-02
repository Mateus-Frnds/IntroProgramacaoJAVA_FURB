package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a sua renda anual bruta: ");
        double rendaAnual = scanner.nextDouble();

        System.out.println("Informe o número de dependentes: ");
        int dependentes = scanner.nextInt();

        double valorPorDep = (rendaAnual * 2 / 100) * dependentes;
        double rendaLiquida = rendaAnual - valorPorDep;

        if (rendaAnual > 2000 && rendaAnual < 5000) {
            double IR = rendaLiquida * 5 / 100;
            System.out.println("Seu imposto de renda mensal a pagar é: " + IR);

        } else if (rendaAnual > 5000 && rendaAnual < 10000) {
            double IR = rendaLiquida * 10 / 100;
            System.out.println("Seu imposto de renda mensal a pagar é: " + IR);

        } else if (rendaAnual > 10000) {
            double IR = rendaLiquida * 15 / 100;
            System.out.println("Seu imposto de renda mensal a pagar é: " + IR);
            
        }

        scanner.close();
    }
}