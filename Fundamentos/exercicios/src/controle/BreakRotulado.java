package controle;

public class BreakRotulado {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (i == 1)
					break externo;
				System.out.printf("[%d %d]", i, j);
			}
			System.out.println();
		}
	}
}
