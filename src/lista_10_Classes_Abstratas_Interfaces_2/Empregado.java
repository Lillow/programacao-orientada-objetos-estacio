package lista_10_Classes_Abstratas_Interfaces_2;

public class Empregado extends Pessoa {
	private Double salario;

	public Empregado(String nome, Double salario) {
		super(nome);
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public String getDescricao() {
		return super.getNome() + ", R$ " + salario.toString();
	}

	public void atualizaSalario(double porPercentual) {
		salario = salario * porPercentual / 100;
	}
}
