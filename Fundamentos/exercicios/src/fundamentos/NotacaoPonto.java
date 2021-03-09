package fundamentos;

public class NotacaoPonto {

	public static void main(String[] args) {
		
		String s = "Hello X";
		s = s.toUpperCase();
		
		System.out.println(s);
		
		s = s.replace("X", "people");
		System.out.println(s);
		
		s = s.concat("!!!");
		System.out.println(s);
		
		System.out.println("Vinicius".toUpperCase());
		
		String y = "Olá X"
				.replace("X", "Vinicius")
				.toUpperCase()
				.concat("...");
		System.out.println(y);

	}

}
