package lista_11_Classes_Abstratas_Interfaces_2;

public class Cliente implements Dao {
	private int codigo;
	private String nome;

	public void inserir() {
		System.out.println("Cliente inserido.");
	}

	public void excluir() {
		System.out.println("Cliente excluido.");
	}

	public void localizar() {
		System.out.println("Localizando cliente...");
	}
}
