package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {

	public static void main(String[] args) {

//		Produto produto = new Produto("Caneta", 7.45);
//		Produto produto = new Produto("Notebook", 2987.78);
		Produto produto = new Produto("Monitor 23", 789.98);

		DAO<Produto> dao = new DAO<>(Produto.class);
//		dao.abrirTransacao().incluir(produto).fecharTransacao().fechar();

//		incluir atomico já faz tudo da linha acima
		dao.incluirAtomico(produto).fechar();

		System.out.println("ID do produto: " + produto.getId());

	}
}
