package OrientaçãoObjetos;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Kaio muller");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 10, 100);
		compra1.adicionarItem(new Produto("notebook", 5000), 2);
	
		Compra compra2 = new Compra();
		compra2.adicionarItem("caderno", 10, 100);
		compra2.adicionarItem(new Produto("impressora", 10000), 2);
	
		Cliente Cliente = new Cliente("kassia muller");
		cliente.compras.add(compra1);
		cliente.compras.add(compra2);
		
		System.out.println(cliente.obterValorTotal());
	
	}
}
