package Unidade3.AtividadeAula;
import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o preço do litro da gasolina:");
        float gasolinalitro = scanner.nextFloat();

        System.out.println("Insira o valor disponível para o pagamento:");
        float orcamento = scanner.nextFloat();

        double valor = orcamento / gasolinalitro;

        System.out.println("Você consegue abastecer " + valor + " litros de gasolina");
     
        scanner.close();

    }
}
