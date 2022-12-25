package lista_11_Classes_Abstratas_Interfaces_1;

public class Secretario extends Funcionario {
	public double getBonificacao() {
		return 0.05 * getSalario();
	}
}
