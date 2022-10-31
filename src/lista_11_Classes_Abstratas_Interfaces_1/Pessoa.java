package lista_11_Classes_Abstratas_Interfaces_1;

/******************************
 * 1. Considerando o diagrama abaixo, realize as devidas implementações
 * considerando que Pessoa, PessoaFísica e Funcionário são classes abstratas e
 * todos seus métodos são abstratos:
 ******************************/

public abstract class Pessoa {
	private String nome;
	private int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;

	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

}
