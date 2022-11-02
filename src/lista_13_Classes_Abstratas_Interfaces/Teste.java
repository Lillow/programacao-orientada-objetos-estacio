package lista_13_Classes_Abstratas_Interfaces;

/******************************
 * 9. Crie uma classe de Teste com o método main, onde você irá instanciar um
 * objeto do tipo BancoGeral, sendo implementado por um objeto Banco. Em seguida
 * através do objeto banco crie uma poupança e em seguida uma conta corrente,
 * realize algumas operações com as duas e imprima seus saldos em seguida.
 ******************************/

public class Teste {

	public static void main(String[] args) {
		Cliente c1 = new Cliente("Ricardo", "123.321.634.90");
		Banco b1 = new Banco();
		b1.abrirConta(c1, "1241251123", 1000, 1);
		b1.deposito(800);
		b1.saque(200);
		System.out.printf("Nome: %s\nCPF: %s\nTipo Conta: %s\nSaldo R$: %.2f \n\n", c1.getNome(), c1.getCpf(),
				b1.conta.tipo, b1.conta.getSaldo());

		Cliente c2 = new Cliente("Marina", "532.123.976.12");
		Banco b2 = new Banco();
		b2.abrirConta(c2, "654521244", 1000, 2);
		b2.deposito(800);
		b2.saque(200);
		b2.conta.renderJuros();
		System.out.printf("Nome: %s\nCPF: %s\nTipo Conta: %s\nSaldo R$: %.2f \n\n", c2.getNome(), c2.getCpf(),
				b2.conta.getTipo(), b2.conta.getSaldo());
		System.out.println();
	}

}
