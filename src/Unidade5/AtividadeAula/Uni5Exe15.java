import java.util.Scanner;

/** Dada uma turma de alunos, contendo seu nome e nota de duas provas descreva um algoritmo para informar a média de cada aluno. 
 * Considere que a leitura dos dados deve ser finalizada quando o nome do aluno for “fim”. */

public class Uni5Exe15 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Informe o nome do aluno:");
        String nome = entradas.next();

        while (!nome.trim().equalsIgnoreCase("Fim")) {
            System.out.println("Digite a nota 1:");
            float nota1 = entradas.nextFloat();
            // float nota1 = Float.parseFloat(entradas.nextLine());

            System.out.println("Digite a nota 2:");
            float nota2 = entradas.nextFloat();
            // float nota2 = Float.parseFloat(entradas.nextLine());

            float media = (nota1 + nota2) / 2;

            System.out.println("Média = " + media);

            System.out.println("Informe o nome do aluno:");
            nome = entradas.next();
        }

        entradas.close();
    }
}
