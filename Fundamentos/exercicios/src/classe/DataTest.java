package classe;

public class DataTest {

	public static void main(String[] args) {

		Data d1 = new Data();

		Data d3 = new Data();
		d3.ano = 2021;

		System.out.println(d1.obterDataFormatada());

		var d2 = new Data(31, 12, 2020);

		System.out.println("Data formatada: " + d2.obterDataFormatada());

		d1.imprimirDataFormatada();
		System.out.println("");
		d3.imprimirDataFormatada();

	}

}
