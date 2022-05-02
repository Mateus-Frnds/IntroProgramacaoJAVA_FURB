package Avaliacoes.Avaliacao01;
import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            boolean animal = scanner.nextBoolean();
            boolean especie = scanner.nextBoolean();
            boolean testeespecie = scanner.nextBoolean();

            if (especie == true) {
                System.out.println(animal + " e " + especie);
                System.out.println("Outra Espécie");

                } else {
                    System.out.println("Teste Espécie");

                    if (testeespecie == false){ 
                        System.out.println("Espécie Cadastrada");
                        System.out.println("Outra Espécie");

                    }else{
                        System.out.println("Espécie Vazio");
                        System.out.println("Animal Vazio");
                        System.out.println("Outra Espécie");

                    }
                }
    
            scanner.close();
        }

    }
    