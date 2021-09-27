package br.com.euleoterio.calc.visao;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import br.com.euleoterio.calc.modelo.Memoria;

@SuppressWarnings("serial")
public class Teclado extends JPanel implements ActionListener {

	private final Color COR_CINZA_ESCURO = new Color(66, 62, 66);
	private final Color COR_CINZA_CLARO = new Color(97, 94, 97);
	private final Color COR_LARANJA = new Color(255, 157, 0);

	public Teclado() {

		GridBagLayout layout = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();

		setLayout(layout);

		c.weightx = 1;
		c.weighty = 1;
		c.fill = GridBagConstraints.BOTH;

//		Linha 1
		c.gridwidth = 2; // ocupa espaco de 3 botoes
		addBotao("AC", COR_CINZA_ESCURO, c, 0, 0);
//		addBotao("+/-", COR_CINZA_ESCURO, c, 1, 0);
//		addBotao("%", COR_CINZA_ESCURO, c, 2, 0);
		c.gridwidth = 1;
		addBotao("±", COR_CINZA_ESCURO, c, 2, 0);
		addBotao("/", COR_LARANJA, c, 3, 0);

//		Linha 2
		addBotao("7", COR_CINZA_CLARO, c, 0, 1);
		addBotao("8", COR_CINZA_CLARO, c, 1, 1);
		addBotao("9", COR_CINZA_CLARO, c, 2, 1);
		addBotao("*", COR_LARANJA, c, 3, 1);

//		Linha 3
		addBotao("4", COR_CINZA_CLARO, c, 0, 2);
		addBotao("5", COR_CINZA_CLARO, c, 1, 2);
		addBotao("6", COR_CINZA_CLARO, c, 2, 2);
		addBotao("-", COR_LARANJA, c, 3, 2);

//		Linha 4
		addBotao("1", COR_CINZA_CLARO, c, 0, 3);
		addBotao("2", COR_CINZA_CLARO, c, 1, 3);
		addBotao("3", COR_CINZA_CLARO, c, 2, 3);
		addBotao("+", COR_LARANJA, c, 3, 3);

//		Linha 5
		c.gridwidth = 2;
		addBotao("0", COR_CINZA_CLARO, c, 0, 4);
//		addBotao("0", COR_CINZA_CLARO, c, 1, 4);
		c.gridwidth = 1;
		addBotao(",", COR_CINZA_CLARO, c, 2, 4);
		addBotao("=", COR_LARANJA, c, 3, 4);

//		testes/exemplo gridy
//		c.gridy = 0;
//		c.gridx = 0;
//		add(new Botao("AC", COR_CINZA_ESCURO), c);
//		c.gridx = 1;
//		add(new Botao("+/-", COR_CINZA_ESCURO), c);
//		c.gridx = 2;
//		add(new Botao("%", COR_CINZA_ESCURO), c);
//		c.gridx = 3;
//		add(new Botao("/", COR_LARANJA), c);
//
//		c.gridy = 1;
//		c.gridx = 0;
//		add(new Botao("7", COR_CINZA_CLARO), c);
//		add(new Botao("8", COR_CINZA_CLARO), c);
//		add(new Botao("9", COR_CINZA_CLARO), c);
//		add(new Botao("*", COR_LARANJA), c);
//
//		add(new Botao("7", COR_CINZA_CLARO), c);
//		add(new Botao("8", COR_CINZA_CLARO), c);
//		add(new Botao("9", COR_CINZA_CLARO), c);
//		add(new Botao("*", COR_LARANJA), c);
//
//		add(new Botao("7", COR_CINZA_CLARO), c);
//		add(new Botao("8", COR_CINZA_CLARO), c);
//		add(new Botao("9", COR_CINZA_CLARO), c);
//		add(new Botao("*", COR_LARANJA), c);
//
//		add(new Botao("7", COR_CINZA_CLARO), c);
//		add(new Botao("8", COR_CINZA_CLARO), c);
//		add(new Botao("9", COR_CINZA_CLARO), c);
//		add(new Botao("*", COR_LARANJA), c);

//		Para teste
//		setLayout(new GridLayout(5, 4));
//
//		add(new Botao("AC", COR_CINZA_ESCURO));
//		add(new Botao("+/-", COR_CINZA_ESCURO));
//		add(new Botao("%", COR_CINZA_ESCURO));
//		add(new Botao("/", COR_LARANJA));
//
//		add(new Botao("7", COR_CINZA_CLARO));
//		add(new Botao("8", COR_CINZA_CLARO));
//		add(new Botao("9", COR_CINZA_CLARO));
//		add(new Botao("*", COR_LARANJA));
//
//		add(new Botao("7", COR_CINZA_CLARO));
//		add(new Botao("8", COR_CINZA_CLARO));
//		add(new Botao("9", COR_CINZA_CLARO));
//		add(new Botao("*", COR_LARANJA));
//
//		add(new Botao("7", COR_CINZA_CLARO));
//		add(new Botao("8", COR_CINZA_CLARO));
//		add(new Botao("9", COR_CINZA_CLARO));
//		add(new Botao("*", COR_LARANJA));
//
//		add(new Botao("7", COR_CINZA_CLARO));
//		add(new Botao("8", COR_CINZA_CLARO));
//		add(new Botao("9", COR_CINZA_CLARO));
//		add(new Botao("*", COR_LARANJA));

	}

	private void addBotao(String texto, Color cor, GridBagConstraints c, int x, int y) {
		c.gridx = x;
		c.gridy = y;

		Botao botao = new Botao(texto, cor);
		botao.addActionListener(this);
		add(botao, c);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() instanceof JButton) {

			JButton botao = (JButton) e.getSource();
			Memoria.getInstancia().processarComando(botao.getText());
		}
	}
}
