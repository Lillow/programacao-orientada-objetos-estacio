package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 2. Crie uma classe abstrata chamada ContaAbstrata, está deverá possuir os
 * seguintes atributos privados : número da conta (String), saldo (double),
 * Cliente.
 * 
 * 3. Crie na classe ContaAbstrata os métodos get e set de seus atributos. Em
 * seguida crie os seguintes métodos abstratos: deposito(double valor) e
 * saque(double valor).
 ******************************/

public abstract class ContaAbstrata {
	private String numeroDaConta;
	private double saldo;
	private Cliente cliente;
	public String tipo;

	public String getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(String numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void renderJuros() {
	}

	public abstract void deposito(double valor);

	public abstract void saque(double valor);

}
