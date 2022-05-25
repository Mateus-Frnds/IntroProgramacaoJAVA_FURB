public class Uni5Exe22 {
    public static void main(String[] args) throws Exception {
        float salario = 2000f;
        float aumento1996 = 0.015f;
        float novoAumento = 1;

        float novoSalario = salario + (salario * aumento1996);

        int ano = 1997;

        while (ano <= 2022) {
            ano += 1;

            novoAumento = aumento1996 * 2;

            novoSalario = novoSalario + (novoSalario * novoAumento);
        }

        System.out.println("O salário atual do funcionário (considerando-se o ano de"
        + " 2022) é: " + novoSalario);
    }
}