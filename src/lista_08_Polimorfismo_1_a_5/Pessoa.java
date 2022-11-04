package lista_08_Polimorfismo_1_a_5;

/******************************
 * 1. Criar uma Classe Pessoa, contendo os atributos encapsulados, com seus
 * respectivos (getters) e (setters), e ainda o construtor padrão com pelo menos
 * mais duas opções de construtores conforme sua percepção. Atributos: nome,
 * endereço e telefone;
 ******************************/

public class Pessoa {
	private String nome;
	private String endereco;
	private int telefone;

	public Pessoa() {
	}

	public Pessoa(String nome, String endereco, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

}
