public class Uni5Exe11 {
    public static void main(String[] args) throws Exception {
        int horas = 1;
        int quebrados = 1; 
        int totalDia = 1;

        System.out.println("Horas: " + horas 
        + "\nBiscoitos quebrados: " + quebrados);

        for (horas = 2; horas <= 16; horas++) {
            quebrados *= 3;
            totalDia += quebrados;
            System.out.println("Horas: " + horas 
            + "\nBiscoitos quebrados: " + quebrados);
        }

        System.out.println("Biscoitos quebrados ao final do dia: " + totalDia);
    }
}