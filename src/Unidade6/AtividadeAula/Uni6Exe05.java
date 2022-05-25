import java.util.Scanner;

public class Uni6Exe05 {

    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        String respostas1[] = new String[5];
        String[] respostas2 = new String[5];
        String[] perguntas = { "Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
                "Gosta de redes sociais?",
                "Gosta de Oktoberfest?" };

        int contador = 0;

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            respostas1[i] = entradas.next();
        }

        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i]);
            respostas2[i] = entradas.next();
        }

        for (int i = 0; i < 5; i++) {
            if (respostas1[i].trim().equalsIgnoreCase(respostas2[i])) {
                contador += 3;
            } else if (respostas1[i].trim().equalsIgnoreCase("Sim") &&
                    respostas2[i].trim().equalsIgnoreCase("Nao") ||
                    respostas1[i].trim().equalsIgnoreCase("Nao") &&
                            respostas2[i].trim().equalsIgnoreCase("Sim")) {
                contador -= 2;
            } else {
                contador += 1;
            }
        }

        if (contador == 15) {
            System.out.println("Casem");
        } else if (contador >= 10 && contador <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (contador >= 5 && contador <= 9) {
            System.out.println("Talvez não dê certo");
        } else if (contador >= 0 && contador <= 4) {
            System.out.println("Vale um encontro");
        } else if (contador <= -1 && contador >= -9) {
            System.out.println("Melhor não perder tempo");
        } else {
            System.out.println("Vocês se odeiam");
        }

        entradas.close();
    }
}
