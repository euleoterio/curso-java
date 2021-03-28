package fundamentos;

import java.util.Scanner;

public class TipoStringEquals {

	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		
		Scanner input = new Scanner(System.in);
		
//		o .next() já tira os espaços
		String s2 = input.nextLine();
		System.out.println("2" == s2.trim());
		System.out.println("2".equals(s2.trim()));
		
		
		input.close();
	}

}
