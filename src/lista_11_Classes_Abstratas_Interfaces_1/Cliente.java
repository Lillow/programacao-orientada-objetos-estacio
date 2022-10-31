package lista_11_Classes_Abstratas_Interfaces_1;

public class Cliente extends PessoaFisica implements Autenticavel {
	private double saldo;
	private double limite;
	private double chequeEspecial;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}

	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	public void saca(double valor) {
		saldo -= valor;
	}

	public void deposita(double valor) {
		saldo += valor;
	}

	public boolean autentica(int senha) {
		return true;
	}
}
