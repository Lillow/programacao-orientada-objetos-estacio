package lista_3_vendas;

public class VendasTeste {
	public static void main(String[] args) {
		Vendas venda1 = new Vendas(100, 1);
		Vendas venda2 = new Vendas(100);
		Vendas venda3 = new Vendas(100, 45);
		
		System.out.println(venda1.toString());
		System.out.println(venda2.toString());
		System.out.println(venda3.toString());
	}
}
