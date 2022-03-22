package Unidade3.AtividadeAula;
import java.util.Scanner;

public class Uni3Exe02 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        float valor, desconto, preco;

        System.out.println("Informe o valor do sapato: ");
        valor = scanner.nextFloat();

        desconto = (float) (valor * 0.12);
        preco = valor - desconto;

        System.out.printf("O valor do desconto é de R$%.2f%n", desconto);
        System.out.print("");
        System.out.printf("O preço do par de sapatos com desconto é R$%.2f%n", preco);

        scanner.close();

    }
}