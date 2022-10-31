package lista_08_questao_1_a_5_pessoa;

public class Vendedor extends Empregado {
	private double valorVendas;
	private double comissao;

	public Vendedor(String nome, String endereco, int telefone, int codigoSetor, double salarioBase, double imposto,
			double valorVendas, double comissao) {
		super(nome, endereco, telefone, codigoSetor, salarioBase, imposto);
		this.valorVendas = valorVendas;
		this.comissao = comissao / 100 * getSalarioBase();
	}

	public double getValorVendas() {
		return valorVendas;
	}

	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		return getSalarioBase() - getImposto() + comissao;
	}

}
