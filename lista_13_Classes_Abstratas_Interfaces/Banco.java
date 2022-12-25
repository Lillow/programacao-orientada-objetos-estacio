package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 8. Crie uma classe chamada Banco, que implementará a interface BancoGeral,
 * dando as seguintes implementações para cada método: - abrirConta(Cliente c,
 * String numeroDaConta, double saldoInicial, String tipo): Criará uma Conta com
 * o número informado, o saldo informado e o cliente informado. O tipo da conta
 * a ser criada dependerá do tipo informado, podendo ser Poupança ou Conta
 * Corrente. - deposito(ContaAbstrata c, double valor): fará um deposito na
 * conta informada no valor informado. - saque(ContaAbstrata c, double valor):
 * fará um saque na conta informada no valor informado.
 ******************************/

public class Banco implements BancoGeral {
	public ContaAbstrata conta;

	public void abrirConta(Cliente c, String numeroDaConta, double saldoInicial, int tipo) {
		switch (tipo) {
		case 1: {
			conta = new ContaCorrente(c, numeroDaConta, saldoInicial, "Corrente");
			break;
		}

		case 2: {
			conta = new Poupanca(c, numeroDaConta, saldoInicial, "Poupança");
			break;
		}
		default:
			System.out.println("Tipo inválido");
		}
	}

	public void deposito(double valor) {
		conta.deposito(valor);

	}

	public void saque(double valor) {
		conta.saque(valor);
	}

}
