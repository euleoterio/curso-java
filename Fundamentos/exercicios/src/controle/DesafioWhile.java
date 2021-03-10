package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;

		while (nota != -1) {
			System.out.println("Informe a nota: ");
			nota = input.nextDouble();

			if (nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeNotas++;
			} else if (nota != -1)
				System.out.println("Nota inválida");
			else
				System.out.println("Calculando a média...");
		}

//		Calcular média 
		double media = total / quantidadeNotas;
		System.out.println("Média= " + media);

		input.close();

	}

}
