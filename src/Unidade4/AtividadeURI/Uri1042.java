package Unidade4.AtividadeURI;
import java.util.Scanner;

public class Uri1042 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if (a < b && a < b) {
			System.out.println(a);
			if (b < c) {
				System.out.println(b);
				System.out.println(c);
				
			} else {
				System.out.println(c);
				System.out.println(b);
			}
			
		} else if (b < c) {
			System.out.println(b);
			
			if (a < c) {
				System.out.println(a);
				System.out.println(c);
				
			} else {
				System.out.println(c);
				System.out.println(a);
			}
			
		} else {
			System.out.println(c);
			
			if (a < b) {
				System.out.println(a);
				System.out.println(b);
				
			} else {
				System.out.println(b);
				System.out.println(a);
			}
		}

        System.out.println("");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);

        scanner.close();
    }
}