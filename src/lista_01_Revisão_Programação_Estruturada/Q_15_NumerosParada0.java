package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

//15. Escreva uma classe que receba diversos números(inteiros e/ou positivos) do usuário e o programa 
//deve ser interrompido ao ser informado o número zero. Com os números recebidos, determine o 
//maior e o menor valor deste conjunto de números

public class Q_15_NumerosParada0 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num, maior, menor;
		
		System.out.println("Digite um número: ");
		num = scan.nextInt();
		maior = num;
		menor = num;

		while (true) {

			if (num >= 0) {
				
				if (num == 0) {
					break;
				} else if (num > maior) {
					maior = num;
				} else if (num < menor) {
					menor = num;
				}

			} else {
				if (num < 0) {
					System.out.println("Número inválido!");
				}
			}
			
			System.out.println("Digite outro número: ");
			num = scan.nextInt();

		}
		System.out.printf("O maior valor digitado foi %d e o menor foi %d ", maior, menor);
	}
}
