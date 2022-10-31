package lista_08_questao_1_a_5_pessoa;

public class Teste {
	public static void main(String[] args) {
		Fornecedor p1 = new Fornecedor("Fornecedor", "Rua 3, Cidadezinha-PA", 12345678, 1000, 100);

		System.out.println(p1.getNome());
		System.out.println(p1.getEndereco());
		System.out.println(p1.getTelefone());
		System.out.println(p1.obterSaldo() + "\n");

		Empregado p2 = new Empregado("Empregado", "Rua 8, Cidadezinha-CA", 12345678, 10000, 1200, 10);

		System.out.println(p2.getNome());
		System.out.println(p2.getEndereco());
		System.out.println(p2.getTelefone());
		System.out.println(p2.calcularSalario() + "\n");

		Administrador p3 = new Administrador("Administrador", "Rua 5, Cidadezinha-FA", 12345678, 20000, 1200, 10, 800);

		System.out.println(p3.getNome());
		System.out.println(p3.getEndereco());
		System.out.println(p3.getTelefone());
		System.out.println(p3.calcularSalario() + "\n");

		Operario p4 = new Operario("Operario", "Rua 2, Cidadezinha-LA", 12345678, 30000, 1200, 10, 500, 20);

		System.out.println(p4.getNome());
		System.out.println(p4.getEndereco());
		System.out.println(p4.getTelefone());
		System.out.println(p4.calcularSalario());
		System.out.println(p4.getComissao() + "\n");

		Vendedor p5 = new Vendedor("Vendedor", "Rua 9, Cidadezinha-MA", 12345678, 40000, 1200, 10, 500, 20);

		System.out.println(p5.getNome());
		System.out.println(p5.getEndereco());
		System.out.println(p5.getTelefone());
		System.out.println(p5.calcularSalario());
		System.out.println(p5.getComissao() + "\n");

	}
}
