package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

//	Ana mae = new Ana(); //transmitido por heranca (extends) não precisa instanciar um obj

	void testeAcessos() {
//		System.out.println(mae.segredo); //é privado, não da pra acessar
//		System.out.println(mae.facoDentroDeCasa); //apenas para classes no mesmo pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
	}
}
