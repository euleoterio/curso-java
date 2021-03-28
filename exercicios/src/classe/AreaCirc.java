package classe;

public class AreaCirc {

	double raio;
	
//	mesmo Static ainda pode ser mudado
//	precisa do final para não poder ser alterado
	final static double PI = 3.1415;

	public AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area () {
		return PI * Math.pow(raio, 2);
	}

	static double area (double raio) {
		return PI * Math.pow(raio, 2);
	}

}
