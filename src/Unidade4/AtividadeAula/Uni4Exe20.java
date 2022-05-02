package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe20 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota obtida na primeira prova: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Informe a nota obtida na segunda prova: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Informe a nota obtida na terceira prova: ");
        double nota3 = scanner.nextDouble();

        System.out.println("Informe a média obtida nos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double media = (nota1 + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;

        if (media >= 9.0) {
            System.out.println("A sua média é: " + media + " e você ficou classificado como aluno nota A. Aprovado!");

        } else if (media >= 7.5 && media < 9.0) {
            System.out.println("A sua média é: " + media + " e você ficou classificado como aluno nota B. Aprovado!");

        } else if (media >= 6.0 && media < 7.5) {
            System.out.println("A sua média é: " + media + " e você ficou classificado como aluno nota C. Aprovado!");

        } else if (media >= 4.0 && media < 6.0) {
            System.out.println("A sua média é: " + media + " e você ficou classificado como aluno nota D. Reprovado!");

        } else {
            System.out.println("A sua média é: " + media + " e você ficou classificado como aluno nota E. Reprovado!");
            
        }

        scanner.close();
    }
}
