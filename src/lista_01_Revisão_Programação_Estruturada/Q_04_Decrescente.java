/******************************************************************************
 
4. Escreva uma classe que receba do usuário cinco diferentes números inteiros e exiba em ordem 
decrescente. Para isto utilize uma condicional encadeada
Pra determinar o maior valor
Que vem em primeiro lugar na ordenação
Quando achar, coloca no primeiro slot do vetor de resposta
Pula um índice e repete o processo
Até percorrer todo o vetor

*******************************************************************************/

package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

public class Q_04_Decrescente {

	public static void ordenarDecres(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int maxPosicao = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] > a[maxPosicao]) {
					maxPosicao = j;
				}
			}
			if (maxPosicao != i) {
				troca(a, maxPosicao, i);
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.printf("%d ", a[i]);
		}
	}

	public static void troca(int[] a, int i, int j) {
		int valor = a[i];
		a[i] = a[j];
		a[j] = valor;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int lista[] = new int[5];

		for (int i = 0; i < lista.length; i++) {
			System.out.printf("Digite o %dº número: ", i + 1);
			lista[i] = scan.nextInt();
		}

		ordenarDecres(lista);
	}

}
