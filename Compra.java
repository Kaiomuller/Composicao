package OrientaçãoObjetos;

import java.util.ArrayList;
import java.util.List;


public class Compra {

	final List<Item>item = new ArrayList<>();
	
	void adicionarItem(Produto produto, int quantidade) {
		this.item.add(new Item(produto, quantidade));
	}
	
	void adicionarItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.item.add(new Item(produto, quantidade));
	}
	double obterValorTotal() {
		double total = 0;
		
		for (Item item: item) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
