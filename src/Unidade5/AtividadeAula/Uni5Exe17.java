import java.util.Scanner;

public class Uni5Exe17 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        float somaAlturas = 0;
        float mediaAlturas = 0;
        int contador = 0;

        System.out.println("Informe seu número de inscrição ou 0 para terminar: ");
        int numeroInscricao = entradas.nextInt();

        System.out.println("Informe sua altura: ");
        float altura = entradas.nextFloat();

        int inscricaoMaisAlto = numeroInscricao;
        int inscricaoMaisBaixo = numeroInscricao;

        float maiorAltura = altura;
        float menorAltura = altura;

        while (numeroInscricao != 0) {
            contador += 1;
            somaAlturas += altura;

            if (altura > maiorAltura) {
                maiorAltura = altura;
                inscricaoMaisAlto = numeroInscricao;
            }

            if (altura < menorAltura) {
                menorAltura = altura;
                inscricaoMaisBaixo = numeroInscricao;
            }

            System.out.println("Informe seu número de inscrição ou 0 para terminar: ");
            numeroInscricao = entradas.nextInt();

            System.out.println("Informe sua altura: ");
            altura = entradas.nextFloat();
        }

        mediaAlturas = (somaAlturas / contador);
        System.out.println("A média das alturas dos atletas é: " + mediaAlturas
        + "\nO atleta mais alto é o atleta com inscrição de número " + inscricaoMaisAlto
        + " com altura de " + maiorAltura
        + "\nO atleta mais baixo é o atleta com inscrição de número " + inscricaoMaisBaixo
        + " com altura de " + menorAltura);

        entradas.close();
    }
}