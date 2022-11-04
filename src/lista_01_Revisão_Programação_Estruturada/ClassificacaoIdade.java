package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

//5. Escreva uma classe que receba a idade de um atleta, faça uma classificação seguindo a tabela abaixo:

public class ClassificacaoIdade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;

		System.out.println("Digite a idade: ");
		idade = sc.nextInt();

		if (idade <= 4) {
			System.out.println("Não permitido.");
		}
	}
}
