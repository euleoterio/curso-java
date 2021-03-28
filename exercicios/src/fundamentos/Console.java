package fundamentos;

import java.util.Scanner;

public class Console {

	public static void main(String[] args) {
		System.out.println("Bom");
		System.out.println(" dia!");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f%n", 1234.5678);
		System.out.printf("Nome: %s%n", "Vinicius");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = input.nextLine();
		
		System.out.println("Digite a sua idade: ");
		int idade = input.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		input.close();

	}

}
