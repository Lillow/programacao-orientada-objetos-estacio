package lista_02_Modularização_Encapsulamento_e_Objetos_1;

import java.util.Scanner;

public class PessoaTeste {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Pessoa pessoa1 = new Pessoa();
		String name;
		int cpf;
		
		System.out.println("Nome: ");
		name = scan.next();
		pessoa1.setName(name);
		
		System.out.println("CPF: ");
		cpf = scan.nextInt();
		pessoa1.setCpf(cpf);
		
		System.out.println(pessoa1.toString());
		
	}
}
