import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Insira um número inteiro qualquer: ");
        int n = entradas.nextInt();

        System.out.println("Informe um número: ");
        int numero = entradas.nextInt();

        int menorNumeroNegativo = numero;
        double media = 0;
        int contagem = 0;

        for (int contador = 0; contador < n; contador++) {
            System.out.println("Informe um número: ");
            numero = entradas.nextInt();

            if (numero < 0 && numero < menorNumeroNegativo) {
                menorNumeroNegativo = numero;
            } 

            if (numero > 0) {
                media = media + numero;
                contagem++;
            }
        }

        System.out.println("O menor número negativo é: " + menorNumeroNegativo + "\nMédia de todos os números positivos: " + (media / contagem));

        entradas.close();
    }
}



