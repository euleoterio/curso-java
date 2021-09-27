package br.com.euleoterio.calc.visao;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import br.com.euleoterio.calc.modelo.Memoria;
import br.com.euleoterio.calc.modelo.MemoriaObservador;

@SuppressWarnings("serial")
public class Display extends JPanel implements MemoriaObservador {

	private final JLabel label;

	public Display() {
		Memoria.getInstancia().adicionarObservador(this);

		setBackground(new Color(45, 41, 45));
		label = new JLabel(Memoria.getInstancia().getTextoAtual());
		label.setForeground(Color.WHITE);
		label.setFont(new Font("courier", Font.PLAIN, 30));

		setLayout(new FlowLayout(FlowLayout.RIGHT, 10, 25));

		add(label);
	}

	@Override
	public void valorAlterador(String novoValor) {
		label.setText(novoValor);

	}
}
