public class Uni5Exe21 {
    public static void main(String[] args) throws Exception {
        float alturaChico = 150f;
		float alturaZe = 110f;
		int anos = 0;
		
		while (alturaZe <= alturaChico) {
			alturaChico += 2;
			alturaZe += 3;
			
			anos++;
		}
	
		System.out.println("Serão necessários " + anos + " anos para Zé ser" 
        + " maior que Chico");
    }
}
