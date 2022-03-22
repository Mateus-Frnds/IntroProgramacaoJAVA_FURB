package Unidade3.AtividadeURI;
import java.util.Scanner;

public class Uri1008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nfuncionario;
        int horas;
        double salario, soma;

        nfuncionario = scanner.nextInt();
        horas = scanner.nextInt();
        salario = scanner.nextDouble();

        soma = horas * salario;

        System.out.println("NUMBER = " + nfuncionario);
        System.out.printf("SALARY = U$ %.2f%n", soma);

        scanner.close();
        
    }
    
}
