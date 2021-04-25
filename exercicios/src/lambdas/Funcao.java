package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> parOuimpar = num -> num % 2 == 0 ? "Par" : "Ímpar";
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		Function<String, String> empolgado = valor -> valor + "!!!!";
		Function<String, String> duvida = valor -> valor + "???";

		String resultadoFinal = parOuimpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		System.out.println(resultadoFinal);
		String resultadoFinal2 = parOuimpar.andThen(oResultadoE).andThen(duvida).apply(32);
		System.out.println(resultadoFinal2);
		System.out.println(parOuimpar.apply(32));
		
	}

}
