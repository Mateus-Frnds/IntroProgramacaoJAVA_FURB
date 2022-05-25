import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        System.out.println("Informe a quantidade total de reabastecimentos: ");
        int totalAbastecimentos = entradas.nextInt();

        System.out.println("Informe o valor inicial do odômetro com o tanque cheio: ");
        int kmInicial = entradas.nextInt();

        int kmDiferenca = 0;
        int soma = 0;

        for (int quantidadeAbastecimentos = 0; 
            quantidadeAbastecimentos < totalAbastecimentos; 
            quantidadeAbastecimentos++) {

                System.out.print("Informe o valor atual do odômetro: ");
                int kmAtual = entradas.nextInt();

                System.out.print("Informe a quantidade em litros de combustível: ");
                float quantidadeCombustivel = entradas.nextFloat();

                kmDiferenca = kmAtual - kmInicial;
                kmInicial = kmAtual;

                float kmPorLitro = (kmDiferenca / quantidadeCombustivel);

                System.out.println("A quilometragem obtida de combustível na parada " + 
                quantidadeAbastecimentos + " é de " + kmPorLitro + " L");

                soma += kmPorLitro;
        }

       // float kmMedia = (soma / totalAbastecimentos);
        System.out.println("A quilometragem média obtida por litro de combustível em toda a viagem é: " 
            + (soma / totalAbastecimentos));

        entradas.close();
    }
}