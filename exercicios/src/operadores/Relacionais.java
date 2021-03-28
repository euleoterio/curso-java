package operadores;

public class Relacionais {

	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a'; //unicode
		
		System.out.println(a == b);
		System.out.println("\u0061");
		
		System.out.println(3 > 4);
		System.out.println(3 >= 4);
		System.out.println(3 < 4);
		System.out.println(30 <= 4);
		System.out.println(30 != 4);
		
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && nota >=7;
		
		System.out.println("Tem desconto? " + temDesconto);
	}

}
