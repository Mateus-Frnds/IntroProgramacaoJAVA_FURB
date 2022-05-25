import java.util.Scanner;

public class Uni5Exe33 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int votosCandidato1 = 0;
        int votosCandidato2 = 0;
        int votosCandidato3 = 0;
        int votosCandidato4 = 0;
        int votosNulos5 = 0;
        int votosBrancos6 = 0;
        int voto = 0;

        do {
            System.out.println("Informe seu voto de acordo com as opções"
            + "\nCandidato 1 (1)"
            + "\nCandidato 2 (2)"
            + "\nCandidato 3 (3)"
            + "\nVoto nulo (5)"
            + "\nVoto em branco (6)");
            voto = entradas.nextInt();

            switch (voto) {
                case 1:
                votosCandidato1 += 1;
                break;

                case 2:
                votosCandidato2 += 1;
                break;

                case 3:
                votosCandidato3 += 1;
                break;

                case 4:
                votosCandidato4 += 1;
                break;

                case 5:
                votosNulos5 += 1;
                break;

                case 6:
                votosBrancos6 += 1;
                break;

                default:
                System.out.println("Voto inválido.");
            
            } } while (voto != 0); 
        
                double totalVotos = votosCandidato1 + votosCandidato2 + votosCandidato3 
                + votosCandidato4 + votosNulos5 + votosBrancos6;

                double percentualBranco = (votosBrancos6 / totalVotos) * 100;
                double percentualNulo = (votosNulos5 / totalVotos) * 100;

                System.out.println("O total de votos contados foi: " + totalVotos);
                System.out.println("O total de votos para o candidato 1 foi: "
                + votosCandidato1);
                System.out.println("O total de votos para o candidato 2 foi: "
                + votosCandidato2);
                System.out.println("O total de votos para o candidato 3 foi: "
                + votosCandidato3);
                System.out.println("O total de votos para o candidato 4 foi: "
                + votosCandidato4);
                System.out.println("O total de votos nulos foi: "
                + votosNulos5 + "\nO percentual de votos nulos em relação ao total foi: " 
                + percentualNulo + "%");
                System.out.println("O total de votos em branco foi: "
                + votosBrancos6 + "\nO percentual de votos brancos em relação ao total foi: " 
                + percentualBranco + "%");
        
        entradas.close();
    }
}
