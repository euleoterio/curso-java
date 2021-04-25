package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {

//		Lambda p/ quando a interface tem 1 método apenas
		Calculo calc = (x, y) -> {
			return x + y;
		};

		System.out.println(calc.executar(2, 3));

//		Função Lambda
//		Mesma coisa ideia da função na linha 8
		calc = (x, y) -> x * y;
		System.out.println(calc.executar(2, 3));

		System.out.println(calc.legal());
		System.out.println(Calculo.muitoLegal());
	}
}
