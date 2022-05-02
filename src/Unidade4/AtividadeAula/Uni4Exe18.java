package Unidade4.AtividadeAula;
import java.util.Scanner;

public class Uni4Exe18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe do dia do vencimento da parcela: ");
        int diaVencimento = scanner.nextInt();

        System.out.println("Informe do dia em que o pagamento foi realizado: ");
        int diaPagamento = scanner.nextInt();

        System.out.println("Informe o valor da parcela: ");
        double valorPagar = scanner.nextInt();

        if (diaPagamento <= diaVencimento) {
            double valorFinal = valorPagar - valorPagar * 10 / 100;
            System.out.println("Seu pagamento está em dia e você deve pagar: R$" + valorFinal);

        } else if (diaPagamento > diaVencimento && diaPagamento < diaVencimento + 5) {
            double valorFinal = valorPagar;
            System.out.println("Seu pagamento está em atraso e você deve pagar: R$" + valorFinal);

        }
        else if (diaPagamento > diaVencimento + 5) {
            double valorFinal = valorPagar + ((valorPagar * 2 / 100) * (diaPagamento - diaVencimento));
            System.out.println("Seu pagamento está em atraso e você deve pagar: R$" + valorFinal);
            
        }

        scanner.close();
    }
}
