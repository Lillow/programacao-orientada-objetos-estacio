/******************************************************************************

21. Escreva uma classe que armazene valores do usuário em um array com 10 números inteiros positivos. 
a. Ao final Exiba na tela:
b. O maior elemento par (se houver);
c. O menor elemento ímpar (se houver);
d. O somatório de todos os elementos;
e. A média de todos os elementos.
f. Imprima também o elemento que da posição 3 e 7;
g. Some os valores da posição 4 e 8, depois mostre o resultado.
h. Verifique se o valor da posição 5 é múltiplo do valor da posição 9.

*******************************************************************************/

package lista_01;

import java.util.Scanner;

public class Array10 {
	public static void checkVetor(int[] vetor) {
		int maiorPar = 0;
		int menorImpar = 0;
		int total = 0;
		int media;

		for (int i = 0; i < vetor.length; i++) {
			total += vetor[i];
			if (i == 0) {
				maiorPar = vetor[i];
				menorImpar = maiorPar;
			} else {
				if (vetor[i] % 2 == 0 && vetor[i] > maiorPar) {
					maiorPar = vetor[i];
				} else if (vetor[i] % 2 != 0 && vetor[i] < menorImpar) {
					menorImpar = vetor[i];
				}
			}

		}
		media = total / vetor.length;
		
		if (maiorPar % 2 == 0) {
			System.out.println("O maior elemento par é " + maiorPar);
		}else {
			System.out.println("Não há um número maior par. ");
		}
		if (menorImpar % 2 != 0 && menorImpar > 0){
			System.out.println("O menor elemento ímpar é " + menorImpar);
		}else {
			System.out.println("Não há um menor lemento ímpar.");
		}
		System.out.println("O somatório de todos os elementos é " + total);
		System.out.println("A média de todos os elementos é " + media);
		System.out.printf("O elemento da posição 3 é %d e o da posição 7 é %d \n", vetor[3], vetor[7]);
		System.out.printf("Os valores da posição 4 e 8 somados é %d + %d = %d \n", vetor[4], vetor[8], vetor[4] + vetor[8]);
		if(vetor[5] % vetor[9] == 0) {
			System.out.println("O valor da posição 5 é múltiplo do valor da posição 9.");
		}else {
			System.out.println("O valor da posição 5 não é múltiplo do valor da posição 9.");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int vetor[] = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Digite o numero na posição %d: ", i);
			vetor[i] = scan.nextInt();
		}

		checkVetor(vetor);

	}
}
