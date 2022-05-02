package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade da primeira mulher: ");
        int mulher1 = scanner.nextInt();

        System.out.println("Digite a idade da segunda mulher: ");
        int mulher2 = scanner.nextInt();

        System.out.println("Digite a idade do primeiro homem: ");
        int homem1 = scanner.nextInt();

        System.out.println("Digite a idade do segundo homem: ");
        int homem2 = scanner.nextInt();

        if (homem1 > homem2 && mulher1 > mulher2) {
            int soma = homem1 + mulher2;
            int mult = homem2 * mulher1;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma);
            System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + mult);

        }
        else if (homem1 > homem2 && mulher2 > mulher1) {
            int soma = homem1 + mulher1;
            int mult = homem2 * mulher2;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma);
            System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + mult);

        } else if (homem2 > homem1 && mulher2 > mulher1) {
            int soma = homem2 + mulher1;
            int mult = homem1 * mulher2;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma);
            System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + mult);

        } else {
            int soma = homem2 + mulher2;
            int mult = homem1 * mulher1;
            System.out.println("A soma da idade do homem mais velho com a mulher mais nova é: " + soma);
            System.out.println("O produto da idade do homem mais novo com a mulher mais velha é: " + mult);
            
        }

        scanner.close();
    }
}
