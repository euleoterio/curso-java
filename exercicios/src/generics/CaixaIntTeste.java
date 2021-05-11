package generics;

public class CaixaIntTeste {

	public static void main(String[] args) {

//		CaixaInt<String> caixaA = new CaixaInt<>();
//		caixaA.guardar("Teste");
//
//		String coisaA = caixaA.abrir();
//		System.out.println(coisaA);

		CaixaInt caixaA = new CaixaInt();
		caixaA.guardar(23);

		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);

	}

}
