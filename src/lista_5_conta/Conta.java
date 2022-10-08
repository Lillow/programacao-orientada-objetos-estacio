package lista_5_conta;

/******************************
 * 4. Implemente:
 * 
 * a. Uma classe Conta com atributo saldo e métodos depositar e sacar para
 * diminuir e aumentar o atributo saldo, respectivamente, a partir de um valor
 * específico. O atributo saldo pode ser negativo.
 * 
 * b. Implemente uma subclasse de Conta chamada Poupanca. Poupanca deve ter o
 * atributo diaRendimetnos do (tipo int) que armazena o dia do mês em que ocorre
 * o rendimento da poupança. Além disso, ainda deve possuir dois métodos
 * necessários para ler e alterar o atributo diaRendimento.
 ******************************/

public class Conta {
	private double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void depositar(double deposito) {
		saldo += deposito;
	}

	public void sacar(double saque) {
		if (saldo > 0 && saldo > saque) {
			saldo -= saque;
		}
	}
}
