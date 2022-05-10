package Unidade5.AtividadeAula;
import java.util.Scanner;

public class Uni5Exe15 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nome = "";
    double nota1, nota2, media;

    while (!nome.equals("fim")) {
      System.out.print(" nome: "); nome = scanner.next();
      if (!nome.equals("fim")) {
        System.out.print(" nota1: "); nota1 = scanner.nextDouble();
        System.out.print(" nota2: "); nota2 = scanner.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println(" Média: " + media);
      }
    }

    scanner.close();
  }
}