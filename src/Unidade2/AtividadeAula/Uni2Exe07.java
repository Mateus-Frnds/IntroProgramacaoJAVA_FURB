package Unidade2.AtividadeAula;
import java.util.Locale;
import java.util.Scanner;

// Faça um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas
// por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
// informar o total a receber no final do mês, com duas casas decimais.

public class Uni2Exe07 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 

        Locale.setDefault(Locale.US);

            System.out.println("Insira o nome do vendedor:");
            String nome = scanner.nextLine();

            System.out.println("Insira o salário fixo do vendedor:");
            float salario = scanner.nextFloat();

            System.out.println("Insira o total de vendas efetuadas (em dinheiro):");
            double vendas = scanner.nextDouble();

            double percentvendas = vendas * 0.15;
            double total = percentvendas + salario;

            System.out.printf("Nome: " + nome);
            System.out.println("");
            System.out.printf("Total a receber: %.2f%n", total);

            scanner.close();
        }
    
}