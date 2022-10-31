package lista_11_Classes_Abstratas_Interfaces_1;

public class Teste {
	public static void main(String[] args) {
		Secretario secretario = new Secretario();
		Gerente gerente = new Gerente();
		Diretor diretor = new Diretor();
		Cliente cliente = new Cliente();

		// secretário
		secretario.setNome("Pedro");
		secretario.setIdade(34);
		secretario.setCpf("123.542.234-80");
		secretario.setSalario(4000);

		System.out.println("Secretário");
		System.out.println("Nome: " + secretario.getNome());
		System.out.println("Idade: " + secretario.getIdade());
		System.out.println("CPF: " + secretario.getCpf());
		System.out.println("Salário: " + secretario.getSalario());
		System.out.println("Bonificação: " + secretario.getBonificacao() + "\n");

		// Gerente
		gerente.setNome("Lúcia");
		gerente.setIdade(24);
		gerente.setCpf("321.921.412-40");
		gerente.setSalario(8000);

		System.out.println("Gerente");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Idade: " + gerente.getIdade());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salário: R$ " + gerente.getSalario());
		System.out.println("Bonificação: R$ " + gerente.getBonificacao() + "\n");

		// Diretor
		gerente.setNome("Robsom");
		gerente.setIdade(50);
		gerente.setCpf("170.631.512-10");
		gerente.setSalario(12000);

		System.out.println("Diretor");
		System.out.println("Nome: " + gerente.getNome());
		System.out.println("Idade: " + gerente.getIdade());
		System.out.println("CPF: " + gerente.getCpf());
		System.out.println("Salário: R$ " + gerente.getSalario());
		System.out.println("Bonificação: R$ " + gerente.getBonificacao() + "\n");

		// Cliente
		cliente.setNome("Ana");
		cliente.setIdade(30);
		cliente.setCpf("432.612.101-19");
		cliente.setSaldo(5000);
		cliente.setLimite(8000);
		cliente.setChequeEspecial(2000);
		cliente.saca(1000);
		cliente.deposita(100);

		System.out.println("Cliente");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Saldo: " + cliente.getSaldo());

	}
}
