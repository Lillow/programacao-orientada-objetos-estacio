package lista_3_cpf;

public class CpfTeste {
	public static void main(String[] args) {
		String cpf = "12345678985";
		
		cpf = Cpf.formatCpf(cpf);
		
		System.out.println(cpf);
	}
}
