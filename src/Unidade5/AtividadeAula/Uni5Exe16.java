import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int contador1 = 0;
        int contador2 = 0;
        float somaHomens = 0;
        float somaMulheres = 0;

        System.out.println("Informe o seu gênero: M ou m para homens e F ou f para mulheres: ");
        char genero = Character.toLowerCase(entradas.next().charAt(0));

        System.out.println("Informe a sua altura ou digite 0 para terminar: ");
        float altura = entradas.nextFloat();

            while (altura != 0) {

                if (genero == 'm') {
                    contador1 += 1;
                    somaHomens += altura;
                } else if (genero == 'f') {
                    contador2 += 1;
                    somaMulheres += altura;
                }

                System.out.println("Informe o seu gênero: M ou m para homens e F ou f para mulheres: ");
                genero = Character.toLowerCase(entradas.next().charAt(0));

                System.out.println("Informe a sua altura ou digite 0 para terminar: ");
                altura = entradas.nextFloat();
            }

            float mediaHomens = (somaHomens / contador1);
            float mediaMulheres = (somaMulheres / contador2);

        System.out.println("A média das alturas dos homens é: " + mediaHomens
        + "\nA soma da média das alturas das mulheres é: " + mediaMulheres);

        entradas.close();
    }
}