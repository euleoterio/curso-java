package oo.abstrato;

public class TesteAbstrato {

	public static void main(String[] args) {

//		no nivel Animal temos apenas o mover e respirar
		Animal a = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.respirar());

//		no nivel Mamifero temos também mamar
		Mamifero b = new Cachorro();
		System.out.println(b.mover());
		System.out.println(a.respirar());
		System.out.println(b.mamar());
		

	}

}
