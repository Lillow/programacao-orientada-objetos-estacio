package lista_11_Classes_Abstratas_Interfaces_2;

public class Testar {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.inserir();
		cliente.localizar();
		cliente.excluir();

		Fornecedor fornecedor = new Fornecedor();
		fornecedor.inserir();
		fornecedor.localizar();
		fornecedor.excluir();

		Produto produto = new Produto();
		produto.inserir();
		produto.localizar();
		produto.baixar();
		produto.excluir();
	}

}
