package Unidade2.AtividadeAula;
import java.util.Scanner;

public class Uni2Exe06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nfuncionario;
        int horas;
        double salario, soma;

        System.out.println("Insira o número correspondente ao funcionário:");
        nfuncionario = scanner.next();

        System.out.println("Insira o número de horas trabalhadas do mesmo funcionário:");
        horas = scanner.nextInt();

        System.out.println("Insira o salário do funcionário por hora trabalhada:");
        salario = scanner.nextDouble();

        soma = horas * salario;
        System.out.printf("O total do salário do funcionário " + nfuncionario + " é de R$%.2f%n", soma);

        scanner.close();

    }
    
}
