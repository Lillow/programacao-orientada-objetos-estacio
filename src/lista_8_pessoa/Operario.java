package lista_8_pessoa;

/******************************
 * 5. Crie a classe Operario como subclasse da classe Empregado. Um determinado
 * operário tem como atributos, todos da classe Pessoa e da classe Empregado, e
 * também o atributo valorProducao (que corresponde ao valor monetário dos
 * artigos efetivamente produzidos pelo operário) e o atributo comissao (que
 * corresponde à porcentagem do valorProducao que será adicionado ao vencimento
 * base do operário). Note que deverá redefinir nesta subclasse o método herdado
 * calcularSalario (o salário de um operário é equivalente ao salário de um
 * empregado usual acrescido da referida comissão). Escreva um programa de teste
 * adequado para esta classe.
 ******************************/

public class Operario extends Empregado {
	private double valorProducao;
	private double comissao;

	public Operario(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto,
			double valorProducao, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorProducao = valorProducao;
		this.comissao = comissao / 100 * getSalarioBase();
	}

	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao / 100 * getSalarioBase();
	}

	public double calcularSalario() {
		return getSalarioBase() - getImposto() + comissao;
	}

}
