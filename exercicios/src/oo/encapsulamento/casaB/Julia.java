package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();

	void testeAcessos() {
//		System.out.println(sogra.segredo); //é privado, não da pra acessar
//		System.out.println(sogra.facoDentroDeCasa); //apenas para classes no mesmo pacote
//		System.out.println(sogra.formaDeFalar); //nao herda e não está no mesmo pacote
		System.out.println(sogra.todosSabem);
	}

}
