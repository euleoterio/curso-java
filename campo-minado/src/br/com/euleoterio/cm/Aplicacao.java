package br.com.euleoterio.cm;

import br.com.euleoterio.cm.modelo.Tabuleiro;
import br.com.euleoterio.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

		new TabuleiroConsole(tabuleiro);

	}
}
