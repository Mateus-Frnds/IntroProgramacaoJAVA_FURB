public class Uni5Exe02 {
    public static void main(String[] args) throws Exception {
        /* Descreva um algoritmo que calcule e escreva a soma dos números pares e a 
        soma dos números ímpares entre 1 e 100. */
        int numero;
        int soma = 0;
        int soma2 = 0;

        for (numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                soma += numero;
                System.out.println("Soma dos números pares: " + soma);
            } else {
                soma2 += numero;
                System.out.println("Soma dos números ímpares: " + soma2);
            }
        }
    }
}
