package oo.abstrato;

// usand abstract não me força  a criar o método mover (nesse caso), mas eu posso
public abstract class Mamifero extends Animal {

	@Override
	public final String mover() {
//		final proíbe que seja sobreescrito o metodo mover em outras classes
		return "Saindo do lugar";
	}

	public abstract String mamar();
}