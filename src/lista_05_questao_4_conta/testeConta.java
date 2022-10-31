package lista_05_questao_4_conta;

public class testeConta {
	public static void main(String[] args) {
		Poucanca conta1 = new Poucanca(600, 25);
		Conta conta2 = new Conta(-30);

		System.out.println("Conta1 R$:" + conta1.getSaldo());
		System.out.println("Conta2 R$:" + conta2.getSaldo());
		
		conta1.depositar(300);
		conta2.depositar(1000);
		
		System.out.println("Conta1 R$:" + conta1.getSaldo());
		System.out.println("Conta2 R$:" + conta2.getSaldo());
		
		conta1.sacar(500);
		conta2.sacar(400);
		
		System.out.println("Conta1 R$:" + conta1.getSaldo());
		System.out.println("Conta2 R$:" + conta2.getSaldo());
	}

}
