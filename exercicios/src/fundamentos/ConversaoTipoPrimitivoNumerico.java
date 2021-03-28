package fundamentos;

public class ConversaoTipoPrimitivoNumerico {

	public static void main(String[] args) {
		
		double a = 1; //implícita
		System.out.println(a);
		
//		float b = 1.0F; mesma coisa que a linha abaixo
		float b = (float) 1.12345678912345; //explícita (CAST)
		System.out.println(b);
		
		int c = 130; //valores grandes não cabem no byte 
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 1.999999;
		int f = (int) e; //explícita (CAST)
		System.out.println(f);

	}

}
