package controle;

public class SwitchSemBreak {

	public static void main(String[] args) {

		String faixa = "verde";

//		Switch sem break executa todos blocos abaixo da condição verdadeira
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Faixa preta");
		case "marrom":
			System.out.println("Faixa marron");
		case "roxa":
			System.out.println("Faixa roxa");
		case "verde":
			System.out.println("Faixa verde");
		case "laranja":
			System.out.println("Faixa laranja");
		case "vermelha":
			System.out.println("Faixa vermelha");
		case "amarela":
			System.out.println("Faixa amarela");

//		default:
//			System.out.println("Não sei nada");
		}

	}

}
