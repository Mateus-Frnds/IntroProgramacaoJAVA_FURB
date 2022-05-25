import java.util.Scanner;

public class Uni5Exe14 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        String nome = "";
        float precoCompra = 0;
        float precoVenda = 0;
        float lucro = 0;
        int contador1 = 0;
        int contador2 = 0;
        int contador3 = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe o nome da mercadoria: ");
            nome = entradas.next();

            System.out.println("Informe o preço de compra da mercadoria: ");
            precoCompra = entradas.nextFloat();

            System.out.println("Informe o preço de venda da mercadoria: ");
            precoVenda = entradas.nextFloat();

            lucro = (precoVenda - precoCompra) / precoCompra * 100;

            System.out.println("O valor de compra de " + nome + " foi: " + precoCompra +
            "\nO valor de venda da mercadoria foi: " + precoVenda +
            "\nO lucro fornecido pela mercadoria foi: " + lucro + "%");

            if (lucro < 10) {
                contador1 += 1;
            } else if (lucro > 10 && lucro < 20) {
                contador2 += 1;
            } else if (lucro > 20) {
                contador3 += 1;
            }
        }

        System.out.println("A quantidade de mercadorias com base no lucro que cada" 
        + "uma delas forneceu: "
        + "\nLucro < 10%: " + contador1
        + "\n10% <= Lucro <= 20%: " + contador2
        + "\nLucro > 20%: " + contador3);

        entradas.close();
    }
}