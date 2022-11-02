package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 7. Crie uma interface chamada BancoGeral, que conterá os seguintes métodos:
 * abrirConta(Cliente c, String numeroDaConta, double saldoInicial, String tipo)
 * que retorna uma Conta Abstrata, deposito(ContaAbstrata c, double valor),
 * saque(ContaAbstrata c, double valor);
 ******************************/

public interface BancoGeral {

	public void abrirConta(Cliente c, String numeroDaConta, double saldoInicial, int tipo);

	public void deposito(double valor);

	public void saque(double valor);
}
