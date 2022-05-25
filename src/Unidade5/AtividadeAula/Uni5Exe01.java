public class Uni5Exe01 {
    public static void main(String[] args) throws Exception {
        /* O for é uma estrutura de repetição baseada em contador, utilizada quando
        sabemos o número de vezes que o laço será executado.
        
        Enunciado: Descreva um algoritmo que leia 20 números inteiros e escreva, para 
        cada número lido, se o mesmo é par ou ímpar. */

        for (int numero = 1; numero <= 20; numero++) {
            if (numero % 2 == 0) {
                System.out.println(numero + " - O número é par");
            } else {
                System.out.println(numero + " - O número é ímpar");
            }
        }
    }
}