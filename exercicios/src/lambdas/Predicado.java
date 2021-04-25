package lambdas;

import java.util.function.Predicate;

public class Predicado {

	public static void main(String[] args) {

		Predicate<Produto> isCaro = p -> (p.preco * (1 - p.desconto)) >= 750;

		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
}
