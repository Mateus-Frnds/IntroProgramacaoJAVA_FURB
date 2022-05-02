package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o ano de nascimento do primeiro irmão: ");
        int anoIrmao1 = scanner.nextInt();

        System.out.println("Informe o ano de nascimento do segundo irmão: ");
        int anoIrmao2 = scanner.nextInt();

        System.out.println("Informe o ano de nascimento do terceiro irmão: ");
        int anoIrmao3 = scanner.nextInt();

        if (anoIrmao1 == anoIrmao2 && anoIrmao2 == anoIrmao3) {
            System.out.println("Os irmãos são trigêmeos.");

        } else if (anoIrmao1 != anoIrmao2 && anoIrmao2 == anoIrmao3 ||
                anoIrmao1 != anoIrmao2 && anoIrmao1 == anoIrmao3 ||
                anoIrmao1 != anoIrmao3 && anoIrmao1 == anoIrmao2) {
            System.out.println("Dois dos irmãos são gêmeos.");

        } else {
            System.out.println("São apenas irmãos.");
            
        }

        scanner.close();
    }
}