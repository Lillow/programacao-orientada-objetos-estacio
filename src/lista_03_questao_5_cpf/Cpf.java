package lista_03_questao_5_cpf;

/********************
5) Criar uma classe contendo um método estático que receba um conjunto de 11 números 
e retorne no formato de CPF. 
********************/

public class Cpf {
	public static String formatCpf(String cpf) {

		if (cpf.length() != 11) {
			return "Inválido";
		}

		String bloco1 = cpf.substring(0, 3);
		String bloco2 = cpf.substring(3, 6);
		String bloco3 = cpf.substring(6, 9);
		String bloco4 = cpf.substring(9, 11);

		cpf = bloco1 + "." + bloco2 + "." + bloco3 + "-" + bloco4;
		return cpf;
	}
}
