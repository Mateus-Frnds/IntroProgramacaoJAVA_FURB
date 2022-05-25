import java.util.Scanner;

public class Uni5Exe34 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int contadorContasEncerradas = 0;
        int cadastrarHospede;
        float totalAPagar;

        do {
            System.out.println("Escolha a sua opção.\nCaso deseje encerrar a conta"
            + " de um hóspede, digite 1."
            + "\nCaso deseje verificar o número de contas encerradas, digite 2."
            + "\nCaso deseje sair do sistema de cadastramentos, digite 3.");
            cadastrarHospede = entradas.nextInt();

            switch (cadastrarHospede) {
                case 1:
                System.out.println("Entre com o nome do hóspede: ");
                String nome = entradas.next();

                System.out.println("Informe o número de diárias dos hóspede: ");
                int diarias = entradas.nextInt();

                totalAPagar = (diarias < 15) ? ((7.50f * diarias) + 50.00f) : (diarias > 15) ?
                ((5.00f * diarias) + 50.00f) : ((6.50f * diarias) + 50.00f);

                System.out.println("O total que " + nome + " deverá pagar é de R$ " + totalAPagar);
                
                contadorContasEncerradas += 1;
                
                break;

                case 2:
                System.out.println(contadorContasEncerradas + " hóspedes deixaram o hotel.");
                break;
            }

        } while (cadastrarHospede != 3);

        entradas.close();
    }
}