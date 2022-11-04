/******************************************************************************
 
25. Construa dois métodos, um para guardar 4 números informado pelo usuário e guardar em cada 
posição de um array. No segundo método, retorne e imprima o inverso desses números. Exemplo: 
Números informado: 5 3 7 4 -> Números retornados: 4 7 3 5.

*******************************************************************************/

package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

public class NumInvertido {
	public static void inverNumeros(int[] numeros) {
		int numerosInver[] = new int[4];
		int cont = 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i]);
		}
		
		System.out.print(" -> ");
		
		for (int i = numeros.length -1; i > -1; i--) {
			numerosInver[cont] = numeros[i];
			System.out.print(numerosInver[cont]);
			cont++;
		}
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numeros[] = new int[4];

		for (int i = 0; i < numeros.length; i++) {

			System.out.printf("Dite o %dº número: \n", i + 1);
			numeros[i] = scan.nextInt();
		}
		
		inverNumeros(numeros);
	}
}
