package controle;

public class For {

	public static void main(String[] args) {

		for (int i = 0; i <= 10; i++) {
			System.out.printf("i = %d%n", i);
		}

//		possibilidade de for
		int x = 2;
		for (; x <= 10; ) {
			System.out.printf("x = %d%n", x);
			x++;
		}
		
//		infinito
		for(;;) {
			System.out.println("Loop infinito");
		}
	}
}
