/******************************************************************************

30. A tabela abaixo se refere ao tempo em que um avião leva para percorrer o percurso entre as cidades 
que fazem parte da rota da aeronave.

*******************************************************************************/

package lista_1;

import java.util.Scanner;

public class Aviao {
	public static void viagem() {
		Scanner scan = new Scanner(System.in);
		String cidades[] = { "Recife", "João Pessoa", "Maceió", "Natal", "Aracajú", "Fortaleza", "Salvador" };
		int distancias[][] = new int[7][7];
		int cidade1, cidade2, total;

		for (int i = 0; i < cidades.length; i++) { // linha
			for (int j = 0; j < cidades.length; j++) { // coluna
				if (i == j) {
					distancias[i][j] = 0;
				} else if ((i == 0 && j == 1) || (i == 1 && j == 0) || (i == 1 && j == 5) || (i == 3 && j == 5)
						|| (i == 5 && j == 1) || (i == 5 && j == 3)) {
					distancias[i][j] = 2;
				} else if ((i == 0 && j == 2) || (i == 0 && j == 5) || (i == 2 && j == 0) || (i == 2 && j == 3)
						|| (i == 3 && j == 2) || (i == 5 && j == 0)) {
					distancias[i][j] = 11;
				} else if ((i == 1 && j == 2) || (i == 2 && j == 1)) {
					distancias[i][j] = 7;
				} else if ((i == 0 && j == 3) || (i == 3 && j == 0)) {
					distancias[i][j] = 6;
				} else if ((i == 0 && j == 4) || (i == 1 && j == 6) || (i == 4 && j == 0) || (i == 6 && j == 1)) {
					distancias[i][j] = 15;
				} else if ((i == 0 && j == 6) || (i == 3 && j == 6) || (i == 6 && j == 0) || (i == 6 && j == 3)) {
					distancias[i][j] = 1;
				} else if ((i == 1 && j == 3) || (i == 3 && j == 1)) {
					distancias[i][j] = 12;
				} else if ((i == 2 && j == 4) || (i == 4 && j == 2)) {
					distancias[i][j] = 8;
				} else if ((i == 3 && j == 4) || (i == 4 && j == 3)) {
					distancias[i][j] = 10;
				} else if ((i == 4 && j == 5) || (i == 5 && j == 4)) {
					distancias[i][j] = 5;
				} else if ((i == 2 && j == 6) || (i == 4 && j == 6) || (i == 6 && j == 2) || (i == 6 && j == 4)) {
					distancias[i][j] = 13;
				} else if ((i == 5 && j == 6) || (i == 6 && j == 5)) {
					distancias[i][j] = 14;
				} else if ((i == 2 && j == 5) || (i == 5 && j == 2)) {
					distancias[i][j] = 3;
				} else {
					distancias[i][j] = 4;
				}
			}
		}

//		for (int i = 0; i < cidades.length; i++) {
//			for (int j = 0; j < cidades.length; j++) {
//				System.out.print(" [" + distancias[i][j] + "] ");
//			}
//			System.out.println();
//		}

		for (int i = 0; i < cidades.length; i++) {
			System.out.printf("%d. %s \n", (i + 1), cidades[i]);
		}

		do {
			total = 0;
			System.out.println("\nEscolha os codigos das cidades ou valores repetidos para interromper. \n");
			System.out.println("Digite o número da 1ª cidade: ");
			cidade1 = scan.nextInt() - 1;
			System.out.printf("Você escolheu a cidade %s \n\n", cidades[cidade1]);

			System.out.println("Digite o número da 2ª cidade: ");
			cidade2 = scan.nextInt() - 1;
			System.out.printf("Você escolheu a cidade %s \n\n", cidades[cidade2]);
			
			if(cidade1 == cidade2) {
				break;
			}

			for (int i = cidade1; i <= cidade1; i++) {
				for (int j = 0; j <= cidade2; j++) {
					total += distancias[i][j];
				}
			}

			System.out.printf("De %s até a %s são %d horas \n\n", cidades[cidade1], cidades[cidade2], total);
			
		} while (cidade1 != cidade2);

	}

	public static void main(String[] args) {
		viagem();
	}
}
