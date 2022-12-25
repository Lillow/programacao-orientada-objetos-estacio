package lista_11_Classes_Abstratas_Interfaces_2;

public class Produto implements Dao, Estoque {
	private int numero;
	private String descricao;

	public void inserir() {
		System.out.println("Produto inserido.");

	}

	public void excluir() {
		System.out.println("Produto excluido.");
	}

	public void localizar() {
		System.out.println("Localizando produto.");
	}

	public void baixar() {
		System.out.println("Baixando produto.");
	}
}
