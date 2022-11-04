package lista_08_Polimorfismo_1_a_5;

/******************************
 * 4. Crie a classe Administrador como subclasse da classe Empregado. Um
 * determinado administrador tem todos os atributos da classe Pessoa e da classe
 * Empregado e mais um atributo ajudaDeCusto (ajudas referentes a viagens,
 * estadias, etc...). Note que deverá redefinir na classe Administrador o método
 * herdado calcularSalario (o salário de um administrador é equivalente ao
 * salário de um empregado usual acrescido das ajuda de custo). Escreva um
 * programa de teste adequado para esta classe.
 ******************************/

public class Administrador extends Empregado {
	private double ajudaDeCusto;

	public Administrador(String nome, String endereco, int telefone, int codigoSetor, double salarioBase,
			double imposto, double ajudaDeCusto) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	public double calcularSalario() {
		return getSalarioBase() - getImposto() + ajudaDeCusto;
	}

}
