package oo.heranca.desafio;

public interface Luxo {

	void ligarAr();

	void desligarAr();

//	default permite que a classe não precise implementar o método, mas pode
	default int velocidadeDoAr() {
		return 1;
	};

}
