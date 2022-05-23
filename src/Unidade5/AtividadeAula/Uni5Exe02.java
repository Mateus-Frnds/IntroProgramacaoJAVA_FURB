package Unidade5.AtividadeAula;

public class Uni5Exe02 {
    public static void main(String[] args) {
        
        int numero;
        int soma = 0;
        int soma2 = 0;

        for (numero = 1; numero <= 100; numero++) {
            if (numero % 2 == 0) {
                soma += numero;
                
            } else {
                soma2 += numero;
               
            }          
        }
        System.out.println("Soma dos números pares: " + soma);
        System.out.println("Soma dos números ímpares: " + soma2);
        
    }
}
