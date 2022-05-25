import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);
        
        double altura = 0;
        double soma = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe a sua altura: ");
            altura = entradas.nextFloat();

            soma = soma + altura;
        }

        System.out.println("A média de todas as alturas é: " + (soma / 20));

        entradas.close();
    }
}