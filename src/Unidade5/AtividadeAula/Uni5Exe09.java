import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Informe a quantidade de alunos da turma: ");
        int n = entradas.nextInt();

        String maiorDe18 = "";
        int contagem = 0;

        for (int contador = 0; contador < n; contador++) {
            System.out.println("Informe o nome do aluno: ");
            String nome = entradas.next();

            System.out.println("Informe a idade do aluno: ");
            int idade = entradas.nextInt();

            if (idade == 18) {
                maiorDe18 += nome + "\n";
            } 

            if (idade > 20) {
                contagem++;
            }
        }

        System.out.println("\nNomes dos alunos com mais de 18 anos:\n" + maiorDe18);
        System.out.println("A quantidade de alunos com mais de 20 anos é: " + contagem);

        entradas.close();
    }
}