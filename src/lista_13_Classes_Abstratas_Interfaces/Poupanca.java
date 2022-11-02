package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 4. Crie as classes Poupanca e ContaCorrente, que serão subclasses de
 * ContaAbstrata. Não esqueça de implementar seus métodos abstratos!
 * 
 * 5. Na classe Poupanca adicione o seguinte método: - renderJuros(): aumenta em
 * 1% o saldo
 * 
 ******************************/

public class Poupanca extends ContaAbstrata {
	public Poupanca(Cliente c, String numeroDaConta, double saldoInicial, String tipo) {
		Cliente cliente = c;
		setNumeroDaConta(numeroDaConta);
		setSaldo(saldoInicial);
		setTipo(tipo);
	}

	public void renderJuros() {
		setSaldo(getSaldo() + getSaldo() * 0.01);
	}

	public void deposito(double valor) {
		setSaldo(getSaldo() + valor);
	}

	public void saque(double valor) {
		setSaldo(getSaldo() - valor);
	}
}
