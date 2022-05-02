package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o dia: ");
        int dia = scanner.nextInt();

        System.out.println("Informe o mês: ");
        int mes = scanner.nextInt();

        System.out.println("Informe o ano: ");
        int ano = scanner.nextInt();

        Boolean validade = false;

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
            validade = true;
        }

        if (mes == 2 && dia > 29) {
            validade = false;
        }

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 10 || mes == 12 && dia < 31) {
            validade = true;
        }

        if (dia == 29 && ano % 4 == 0 && !(ano % 100 == 0 && ano % 400 != 0)) {
            validade = true;
        }
        
        if (mes == 2 && dia < 29) {
            validade = true;
        }

        if (validade == true) {
            System.out.println("A data é válida.");

        } else {
            System.out.println("A data não é válida.");

        }

        scanner.close();
    }
}
