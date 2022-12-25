package lista_05_Heranca_1;

public class Funcionario extends Pessoa {
	private static int cont;
	private int matricula;
	private double salario;

	public Funcionario(String nome, String sobrenome, double salario) {
		super(nome, sobrenome);
		cont += 1;
		matricula = cont;

		if (salario > 0) {
			this.salario = salario;
		}

		else {
			System.out.println("Salário inválido.");
		}
	}
	

	public int getMatricula() {
		return matricula;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario > 0) {
			this.salario = salario;
		}

		else {
			System.out.println("Salário inválido.");
		}
	}
	
	public double getSalarioPrimeiraParcela() {
		return 0.6 * salario;
	}
	
	public double getSalarioSegundaParcela() {
		return 0.4 * salario;
	}

}
