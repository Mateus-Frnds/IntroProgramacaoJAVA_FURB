public class Uni5Exe03 {
    public static void main(String[] args) throws Exception {
        
        double numerador, denominador, auxiliar;
        float soma = 0;

        numerador = 1;
        denominador = 1;

        auxiliar = 1;

        for (int contador = 1; contador <= 100; contador++) {
            System.out.println(numerador + "/" + denominador);

            soma += (numerador / denominador);

            denominador += auxiliar;
        }

        System.out.println("Soma = " + soma);
    }
}

/** 
    1/1 + 1/2 + 1/3 + 1/4 + ... 1/100
        +1   +1     +1
 
 Numerador (1)
 Denominador (+1)
 
Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos: */
