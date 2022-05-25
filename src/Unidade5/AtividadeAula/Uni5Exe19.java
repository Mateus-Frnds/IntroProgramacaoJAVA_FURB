import java.util.Scanner;

public class Uni5Exe19 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        float totalAPagar = 0;
        float totalRecebido = 0;
        float desconto = 0;

        System.out.println("Informe o valor da sua compra ou 0 para finalizar: ");
        float valorCompra = entradas.nextFloat();

        while (valorCompra != 0) {
            if (valorCompra > 500) {
                desconto = valorCompra * 0.20f;
            } else if (valorCompra <= 500) {
                desconto = valorCompra * 0.15f;
            }

            totalAPagar = valorCompra - desconto;

            System.out.println("O valor da compra é: R$ " + totalAPagar);

            totalRecebido += totalAPagar;

            System.out.println("Informe o valor da sua compra ou 0 para finalizar: ");
            valorCompra = entradas.nextFloat();
        }

        System.out.println("O total recebido pela loja ao final do dia foi: R$ " + totalRecebido);

        entradas.close();
    }
}