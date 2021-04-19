package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Vinicus", "Euleoterio", 30);

//		p1.idade = -30; // por idade estar publica, pode ser mudado sem validação nenhuma direto na variavel
		p1.setIdade(-25); // agora com regra no setIdade, -31 é pego apenas o valor absoluto
		p1.setIdade(250); // e coloca um max de idade

		System.out.println(p1.getIdade());
		System.out.println(p1.toString());
		System.out.println(p1.getNomeCompleto());

	}

}
