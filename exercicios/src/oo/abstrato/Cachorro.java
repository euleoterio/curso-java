package oo.abstrato;

public class Cachorro extends Mamifero {

	//por ser metodo abstrato em Mamifero, é obrigatório criar
	@Override
	public String mamar() {
		return "Usando leite";
	}
	
//	public String mover() {
//		return "Usando as patas";
//	}
}
