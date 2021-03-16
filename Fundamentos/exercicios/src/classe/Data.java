package classe;

public class Data {

	int dia;
	int mes;
	int ano;

	Data() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970); // chama o construtor ("mesma coisa das 3 linhas a cima")
	}

	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}

//	String formato = "%d/%d/%d"; // para ser variável do projeto todo

	String obterDataFormatada() {
		final String formato = "%d/%d/%d"; // variável local
		return String.format(formato, this.dia, mes, ano);
	}

	void imprimirDataFormatada() {
//		formato = "...";
		System.out.printf(obterDataFormatada());
	}

}
