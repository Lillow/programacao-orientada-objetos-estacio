package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

//6. Escreva uma classe que receba do usuário seu nome e seu ano de seu nascimento e calcule sua idade. 
//Verifique e mostre se ela já tem idade para votar (16 anos ou mais) e para tirar a carteira de 
//habilitação (18 anos ou mais).

public class Q_06_Votar {
	public static void main(String[] args) {
		int anoNasc, idade;
		Scanner sc = new Scanner(System.in);

		System.out.println("Digita o ano que tu nasceu: ");
		anoNasc = sc.nextInt();
		idade = 2022 - anoNasc;

		if (idade <= 16) {
			System.out.println("Tu n pode votar nem tirar CNH");
		} else {
			System.out.println("Ja pode votar no Lula");
			if (idade >= 18) {
				System.out.println("Tu pode dirigir, cuidado");
			}
		}

	}
}
