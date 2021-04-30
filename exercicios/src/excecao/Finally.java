package excecao;

import java.util.Scanner;

public class Finally {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		try {

			System.out.println("Digite o divisor");
			System.out.println(7 / input.nextInt());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finalmente #1");
			input.close();

		}

		try {

			System.out.println("Digite o divisor");
			System.out.println(7 / input.nextInt());
		} finally {
			System.out.println("Finalmente #2");
			input.close();

		}

		System.out.println("Fim!");
	}
}
