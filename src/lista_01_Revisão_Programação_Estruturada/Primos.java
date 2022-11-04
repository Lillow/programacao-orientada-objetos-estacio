package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

//10. Escreva uma classe que receba um número qualquer do usuário e identifique se é um número primo.

public class Primos {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		boolean primo = true;

		System.out.println("Entre com um numero ");
		num = scan.nextInt();

		for (int i = 2; i < num; i++) {
			if(num % i == 0) {
				primo = false;
			}
			
		}
		if (primo) {
			System.out.println("É primo!");
		}else {
			System.out.println("Não é pimo!");
		}
	}
}
