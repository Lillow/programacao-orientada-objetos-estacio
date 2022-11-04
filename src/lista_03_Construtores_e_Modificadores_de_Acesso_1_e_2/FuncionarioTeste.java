package lista_03_Construtores_e_Modificadores_de_Acesso_1_e_2;

public class FuncionarioTeste {
	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario("José", 20, 1200, 3);
		Funcionario funcionario2 = new Funcionario("Maria", 25, 3500, 1);
		Funcionario funcionario3 = new Funcionario("José", 20, 1200, 2);
		
		funcionario2.setSetor(3);
		
		System.out.println(funcionario1.toString());
		System.out.println(funcionario2.toString());
		System.out.println(funcionario3.toString());
	}
}
