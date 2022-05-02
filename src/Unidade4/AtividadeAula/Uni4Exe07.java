package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double pesoExcedido, adicional;

        System.out.println("Entre com o peso da carta em gramas: ");
        double pesoCarta = scanner.nextDouble();

        double valorPagar = 0;

        if (pesoCarta <= 50) {
            valorPagar = 0.45;

        } else {
            pesoExcedido = pesoCarta - 50;
            adicional = (pesoExcedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * adicional;

        }
        System.out.println("O custo do selo é: R$" + valorPagar + ".");

        scanner.close();
    }
    
}
