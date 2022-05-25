import java.util.Scanner;

public class Uni5Exe23 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        float comissaoTotal = 0;

        System.out.println("Descrever o relatório de uma determinada quantidade"
        + " de funcionários.\nDeseja digitar os dados dos vendedores?" 
        + " Digite s caso SIM ou n caso NÃO.");
        char cadastrar = entradas.next().charAt(0);

        while (cadastrar == 's') {
            System.out.println("Informe o nome do funcionário: ");
            String nome = entradas.next();

            System.out.println("Informe a quantidade de produtos vendidas por ele: ");
            int quantidadeVendida = entradas.nextInt();

            System.out.println("Deseja cadastrar os dados dos produtos?"
            + " Digite s caso SIM ou n caso NÃO.");
            char cadastrarProduto = entradas.next().charAt(0);

            while (cadastrarProduto == 's') {
                System.out.println("Informe o valor do produto: ");
                float valorUnitario = entradas.nextFloat();

                System.out.println("Informe a quantidade vendida do produto: ");
                int quantidadeProduto = entradas.nextInt();

                System.out.println("Deseja cadastrar mais um produto?"
                + " Digite s caso SIM ou n caso NÃO.");
                cadastrarProduto = entradas.next().charAt(0);

                float comissaoUnitaria = valorUnitario * 0.30f * quantidadeProduto;

                comissaoTotal += comissaoUnitaria;
            }

            float salario = comissaoTotal * quantidadeVendida;

            System.out.println("Nome: " + nome
            + "\nQuantidade total de vendas: " + quantidadeVendida
            + "\nSalário: " + salario);

            System.out.println("Deseja digitar os dados de mais um vendedor?" 
            + " Digite s caso SIM ou n caso NÃO.");
            cadastrar = entradas.next().charAt(0);
        }

        entradas.close();
    }
}