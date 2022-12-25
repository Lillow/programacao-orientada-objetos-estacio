package lista_03_Construtores_e_Modificadores_de_Acesso_5;

public class CpfTeste {
	public static void main(String[] args) {
		String cpf = "12345678985";
		
		cpf = Cpf.formatCpf(cpf);
		
		System.out.println(cpf);
	}
}
