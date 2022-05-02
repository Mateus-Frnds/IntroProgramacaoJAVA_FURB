package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe a quantidade de meses que foi admitido: ");
        int meses = scanner.nextInt();

        System.out.println("Informe o salário do funcionário: ");
        int salario = scanner.nextInt();

        if (meses <= 12) {
            double novoSalario = salario + (salario * 0.05);
            System.out.println(novoSalario);

        } else if (meses >= 13 && meses <= 48) {
            double novoSalario = salario + (salario * 0.07);
            System.out.println(novoSalario);
            
        }

        scanner.close();
    }
}
