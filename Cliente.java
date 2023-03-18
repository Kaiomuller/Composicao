package OrientaçãoObjetos;

import java.util.List;
import java.util.ArrayList;

public class Cliente {
	String nome;
	
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String cliente){
		this.nome = nome;
	}
	
	double obterValorTotal() {
		double total = 0;
		
	for (Compra compra: compras) {
		total += compra.obterValorTotal();
	}
		return total;
	}
}
