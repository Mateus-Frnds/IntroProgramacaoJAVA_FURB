import java.util.Scanner;

public class Uni5Exe28 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int votosNdN = 0;
        int votosCPM22 = 0;
        int votosSkank = 0;
        int votosJQ = 0;
        int voto;
        String vencedor = "";

        System.out.println("Queremos saber a sua opinião: qual desses quatro"
        + " conjuntos musicais você gosta mais?"
        + "\nNenhum de nós - 1" 
        + "\nCPM22 - 2"
        + "\nSkank - 3"
        + "\nJota Quest - 4"
        + " Deseja votar? Selecione s caso sim e n caso não.");
        char votar = entradas.next().charAt(0);

        while (votar == 's') {
            System.out.println("Compute seu voto: ");
            voto = entradas.nextInt();

            switch (voto) {
                case 1:
                votosNdN += 1;
                break;

                case 2:
                votosCPM22 += 1;
                break;

                case 3:
                votosSkank += 1;
                break;

                case 4:
                votosJQ += 1;
                break;

                default:
                System.out.println("Voto inválido.");
            }

            System.out.println("Deseja votar novamente? Selecione s caso sim e " 
            + "n caso não.");
            votar = entradas.next().charAt(0);
        }

        if (votosNdN > votosCPM22 && votosNdN > votosSkank && votosNdN > votosJQ) {
            vencedor = "Nenhum de Nós";
        }

        if (votosCPM22 > votosNdN && votosCPM22 > votosSkank && votosCPM22 > votosJQ) {
            vencedor = "CPM22";
        }

        if (votosSkank > votosNdN && votosSkank > votosCPM22 && votosSkank > votosJQ) {
            vencedor = "Skank";
        }

        if (votosJQ > votosNdN && votosJQ > votosCPM22 && votosJQ > votosSkank) {
            vencedor = "Jota Quest";
        }

        double totalVotos = votosNdN + votosCPM22 + votosSkank + votosJQ;
        double percentualNdN = (votosNdN / totalVotos) * 100;
        double percentualCPM22 = (votosCPM22 / totalVotos) * 100;
        double percentualSkank = (votosSkank / totalVotos) * 100;
        double percentualJQ = (votosJQ / totalVotos) * 100;

        System.out.println("O total de votos para cada grupo foi: "
            + "\nNenhum de Nós: " + votosNdN
            + "\nCPM22: " + votosCPM22
            + "\nSkank: " + votosSkank
            + "\nJota Quest: " + votosJQ);

        System.out.println("O percentual de votos de cada grupo foi: "
            + "\nNenhum de Nós: " + percentualNdN + "%"
            + "\nCPM22: " + percentualCPM22 + "%"
            + "\nSkank: " + percentualSkank + "%"
            + "\nJota Quest: " + percentualJQ + "%");

        System.out.println("Com base nessas informações, o grupo vencedor é: "
        + vencedor + "!");

        entradas.close();
    }
}
