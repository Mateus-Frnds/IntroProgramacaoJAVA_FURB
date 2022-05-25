import java.util.Scanner;

public class Uni5Exe27 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        float valorDiario;
        int maiorDia = 0;
        int totalPecas = 0;
        String maiorTurno = "";

        System.out.println("Calcular o valor diário a ser pago para os funcionários de" 
        + " uma fábrica.\nDeseja cadastrar as informações dos funcionários? Digite 1" 
        + " caso sim e 2 caso não.");
        int cadastrarFuncionario = entradas.nextInt();

        while (cadastrarFuncionario == 1) {
            System.out.println("Informe o dia do mês de abril em que será calculado"
            + " o valor diário (1 a 30): ");
            int dia = entradas.nextInt();

            System.out.println("Informe o total de peças produzidas no turno"
            + " da manhã: ");
            int turnoManha = entradas.nextInt();

            System.out.println("Informe o total de peças produzidas no turno"
            + " da tarde: ");
            int turnoTarde = entradas.nextInt();

            totalPecas = turnoManha + turnoTarde;

            int totalPecasManha = turnoManha;
            totalPecasManha += turnoManha;

            int totalPecasTarde = turnoTarde;
            totalPecasTarde += turnoTarde;

            switch (dia) {
                case 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15:
                valorDiario = (totalPecas > 100 && turnoManha > 30 && turnoTarde > 30) ? 
                (totalPecas * 0.80f) : (totalPecas * 0.50f);
                System.out.println("O valor diário recebido pelo funcionário é: R$" +
                valorDiario);
                break;
                case 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30: 
                valorDiario = (turnoManha * 0.40f) + (turnoTarde * 0.30f);
                System.out.println("O valor diário recebido pelo funcionário é: R$" +
                valorDiario);
                break;
                default: 
                System.out.println("Dia inválido.");
            }

            System.out.println("Deseja cadastrar um novo funcionário? Digite 1" 
            + " caso sim e 2 caso não.");
            cadastrarFuncionario = entradas.nextInt();

            if (totalPecas > totalPecas) {
                maiorDia = dia;
            }

            if (totalPecasManha > totalPecasTarde) {
                maiorTurno = "manhã";
            } else if (totalPecasManha < totalPecasTarde) {
                maiorTurno = "tarde";
            }
        }

        System.out.println("O dia em que ocorreu a maior produção foi: " + maiorDia);
        System.out.println("O turno em que ocorreu a maior produção foi o turno da: " + maiorTurno);
        
        entradas.close();
    }
}