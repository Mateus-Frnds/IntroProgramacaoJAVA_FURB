/** 
          +2    +2    +2      +2
 S  = 3/2 + 5/6 + 7/12 + 9/20 + 11/30 ...
          +4    +6    +8      +10
              +2    +2     +2 
 
 Numerador (+2)
 Denominador 
 
 Calcular o valor de S considerando os 20 primeiros termos da série. O que precisamos ter aqui? Uma variável para o numerador
 e outra para o denominador. */

public class Uni5Exe04 {
    public static void main(String[] args) throws Exception {

        double numerador, denominador, auxiliar;
        float soma = 0;

        numerador = 3;
        denominador = 2;

        auxiliar = 4;

        for (int contador = 1; contador <= 20; contador++) {
            System.out.println(numerador + "/" + denominador);

            soma += (numerador / denominador);

            numerador += 2;
            denominador += auxiliar;
            auxiliar += 2;
        }

        System.out.println("Soma = " + soma);
    }
}