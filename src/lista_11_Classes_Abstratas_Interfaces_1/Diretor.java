package lista_11_Classes_Abstratas_Interfaces_1;

public class Diretor extends Funcionario implements Autenticavel {
	private int senha;

	public boolean autentica(int senha) {
		boolean r = this.senha == senha ? true : false;
		return r;
	}

	public double getBonificacao() {
		return 0.20 * getSalario();
	}
}
