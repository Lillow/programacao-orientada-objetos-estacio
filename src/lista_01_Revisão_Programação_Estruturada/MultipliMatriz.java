/******************************************************************************

23. Escreva uma classe que efetue, a multiplicação entre duas matrizes A e B do tipo (3 x 3) e preencha 
uma outra matriz R com o resultado, ou seja R = A * B. 
a. Matriz A = { {5, 1, 4}, {7, 3, 5}, {9, 3, 1} }
b. Matriz B = { {6, 3, 7 }, {9, 7, 2 }, {8, 2, 9} }

*******************************************************************************/

package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

public class MultipliMatriz {
	public static void multMatriz(int[][] a, int[][] b) {
		int r[][] = new int[3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				r[i][j] = a[i][j] * b[i][j];
				System.out.printf("[%d x %d = %d]\t", a[i][j], b[i][j], r[i][j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a[][] = { { 5, 1, 4 }, { 7, 3, 5 }, { 9, 3, 1 } };
		int b[][] = { { 6, 3, 7 }, { 9, 7, 2 }, { 8, 2, 9 } };

		multMatriz(a, b);
	}
}
