package lista_10_Classes_Abstratas_Interfaces_2;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa[] pessoa = { new Empregado("Marta", 8000.45), new Estudante("Lúcia", "TI") };

		System.out.println(pessoa[0].getDescricao());
		System.out.println(pessoa[1].getDescricao());
	}
}
