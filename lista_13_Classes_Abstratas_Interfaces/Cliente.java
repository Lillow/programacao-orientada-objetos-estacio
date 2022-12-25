package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 1. Crie uma classe chamada Cliente, contendo os seguintes atributos privados:
 * nome (String), CPF (String).
 ******************************/

public class Cliente {
	private String nome, cpf;

	public Cliente(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

}
