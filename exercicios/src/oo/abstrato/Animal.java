package oo.abstrato;

public abstract class Animal {

	public String respirar() {
		return "CO2";
	}

//	só pode ter método abstract se a classe for abstract
	public abstract String mover(); // quando não é uma método igual para todos

}
