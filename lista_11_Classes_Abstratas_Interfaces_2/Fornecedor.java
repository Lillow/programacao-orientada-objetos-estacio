package lista_11_Classes_Abstratas_Interfaces_2;

public class Fornecedor implements Dao {
	private String cnpj;
	private String razaoSocial;

	public void inserir() {
		System.out.println("Fornecedor inserido.");
	}

	public void excluir() {
		System.out.println("Fornecedor excluido.");

	}

	public void localizar() {
		System.out.println("Localizando fornecedor.");

	}
}
