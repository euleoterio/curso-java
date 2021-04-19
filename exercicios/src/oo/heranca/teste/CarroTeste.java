package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Civic();

		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);

		c1.frear();
		System.out.println(c1);

		c1.acelerar();
		System.out.println(c1);

		Ferrari c2 = new Ferrari(400);

		System.out.println(c2.velocidadeDoAr());

		System.out.println(c2);

		c2.acelerar();
		System.out.println(c2);

		c2.ligarTurbo();
		c2.acelerar();
		System.out.println(c2);

		c2.ligarAr();
		c2.frear();
		System.out.println(c2);

		c2.desligarTurbo();
		c2.acelerar();
		System.out.println(c2);

	}
}
