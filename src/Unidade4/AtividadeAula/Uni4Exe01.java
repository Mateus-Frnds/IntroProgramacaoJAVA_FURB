package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe01 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com as horas trabalhadas no mês: ");
        int horasMes = scanner.nextInt();

        System.out.println("Entre com o valor pago por hora: ");
        float horasValor = scanner.nextFloat();

        float salarioTotal = horasMes * horasValor;

        if (horasMes > 160){
            float salarioExtra = (horasMes - 160) * (horasValor / 2);
            salarioTotal = salarioTotal + salarioExtra;
        }

        System.out.println("O salário total é : " + salarioTotal);

        scanner.close();
        
    }
}