package lista_11_Classes_Abstratas_Interfaces_1;

public abstract class PessoaFisica extends Pessoa {
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
