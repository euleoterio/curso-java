package lambdas;

@FunctionalInterface
// functional interface só pode ter uma função (métodos) 
// porém pode usar método default, static
public interface Calculo {

	double executar(double a, double b);

	default String legal() {
		return "legal";
	}

	static String muitoLegal() {
		return "muito legal";
	}
}
