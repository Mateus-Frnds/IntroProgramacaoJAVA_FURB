import java.util.Scanner;

public class Uni5Exe32 {
    public static void main(String[] args) throws Exception {
        Scanner entradas = new Scanner(System.in);

        int i = 1;
        int contador = 0;

        System.out.println("Em qual dia da semana começa o mês (considere domingo 1 e sábado 7)?");
        int diaSemanaInicial = entradas.nextInt();

        System.out.println("Quantos dias tem o mês?");
        int totalDias = entradas.nextInt();

        System.out.printf("%5c%5c%5c%5c%5c%5c%5c", 'D', 'S', 'T', 'Q', 'Q', 'S', 'S');
		System.out.println("\n________________________________________\n");

        while (i <= totalDias) {
			if (i == 1) {
				System.out.printf("%" + (diaSemanaInicial * 5) + "d", i);
				contador = diaSemanaInicial;
			} else {
				System.out.printf("%5d", i);
				contador++;
			}
			
			if (contador % 7 == 0) {
				System.out.println("");
			}
            i++;
		}

		System.out.println("\n");

        entradas.close();
    }
}
