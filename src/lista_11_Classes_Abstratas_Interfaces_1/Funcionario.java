package lista_11_Classes_Abstratas_Interfaces_1;

public abstract class Funcionario extends PessoaFisica {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public abstract double getBonificacao();

}
