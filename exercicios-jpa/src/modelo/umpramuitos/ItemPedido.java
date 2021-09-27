package modelo.umpramuitos;

import javax.persistence.ManyToOne;

import modelo.basico.Produto;

public class ItemPedido {

	private Long id;
	@ManyToOne
	private Pedido pedido;
	@ManyToOne
	private Produto produto;
	private int quantidade;
	private Double preco;

}
