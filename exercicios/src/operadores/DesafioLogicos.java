package operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		boolean trab1 = true;
		boolean trab2 = false;
		
		boolean tv50 = trab1 && trab2;
		System.out.println("Comprou Tv 50? " + tv50);

		boolean tv32 = trab1 ^ trab2;
		System.out.println("Comprou Tv 32? " + tv32);

		boolean sorvete = trab1 || trab2;
		System.out.println("Tomou sorvete? " + sorvete);
		System.out.println("Mais saudável? " + !sorvete);
	}
	
	
	
}
