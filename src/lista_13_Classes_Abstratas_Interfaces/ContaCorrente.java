package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 6. Na classe ContaCorrente, o método saque(double valor), além de debitar o
 * valor informado debitará também 1% do valor informado, como taxa de juros
 ******************************/

public class ContaCorrente extends ContaAbstrata {
	public ContaCorrente(Cliente c, String numeroDaConta, double saldoInicial, String tipo) {
		Cliente cliente = c;
		setNumeroDaConta(numeroDaConta);
		setSaldo(saldoInicial);
		setTipo(tipo);
	}

	public ContaCorrente() {

	}

	public void deposito(double valor) {
		setSaldo(getSaldo() + valor);
	}

	public void saque(double valor) {
		setSaldo(getSaldo() - (valor + valor * 0.01));
	}
}
