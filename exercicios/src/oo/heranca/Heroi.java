package oo.heranca;

public class Heroi extends Jogador {

	public Heroi(int x, int y) {
		super(x, y);
	}

	// Sobrescrever método da classe Jogador
//	boolean atacar(Jogador oponente) {
//		
//		int deltaX = Math.abs(x - oponente.x);
//		int deltaY = Math.abs(y - oponente.y);
//
//		if ((deltaX == 0 && deltaY == 1) || deltaX == 1 && deltaY == 0) {
//			oponente.vida -= 20;
//			return true;
//		}
//
//		return false;
//
//	}

	// Sobrescrever método da classe Jogador usando o próprio método
	public boolean atacar(Jogador oponente) {
		boolean atk1 = super.atacar(oponente);
		boolean atk2 = super.atacar(oponente);
		return atk1 || atk2;
	}

}
