package lista_8_questao_1_a_5_pessoa;

/******************************
 * 3. Como subclasse da classe Pessoa, criar a classe Empregado. Onde cada
 * instância da classe Empregado tem, para além dos atributos que caracterizam a
 * classe Pessoa, os atributos codigoSetor, salarioBase e imposto (porcentagem
 * retida dos impostos). Implemente a classe Empregado com métodos (getters) e
 * (setters) e um método calcularSalario. Escreva um programa de teste adequado
 * para a classe Empregado.
 ******************************/

public class Empregado extends Pessoa {
	private int codigoSetor;
	private double salarioBase;
	private double imposto;

	public Empregado(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto) {
		super(nome, endereco, telefone);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto / 100 * salarioBase;

	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getImposto() {
		return imposto;
	}

	public void setImposto(double imposto) {
		this.imposto = imposto / 100 * salarioBase;
	}

	public double calcularSalario() {
		return salarioBase - imposto;
	}
}
