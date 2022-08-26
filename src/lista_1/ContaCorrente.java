/******************************************************************************

29. Construa um módulo que, dado um número de conta corrente com cinco dígitos, retorne seu dígito 
verificador, o qual é calculado da seguinte forma:
Exemplo: número da conta: 25678
• Somar números da conta com seu inverso: 25678 + 87652 = 113330;
• Multiplicar cada dígito por sua ordem posicional e somar o resultado:
Conta: 1 1 3 3 3 0
Multiplica Posição pela ordem: 1 * 1 2 * 1 3 * 3 4 * 3 5 * 3 6 * 0
Soma resultado: 1 + 2 + 9 + 12 + 15 + 0 = 39
• O último deste resultado é o dígito verificador da conta (39 - 9).
• Resultado da conta com o dígito verificador: 25678-9

*******************************************************************************/

//Imcompleta!

package lista_1;

import java.util.Scanner;

public class ContaCorrente {
	public static void verificador() {
		Scanner scan = new Scanner(System.in);

		System.out.print("Digite a conta: ");
		Integer conta = scan.nextInt();
		Integer contaInver;
		String contaString = conta.toString();
		String contaStrInver = "";
		Integer vetor[] = new Integer[5];

		for (int i = contaString.length(); i > 0; i--) {
			contaStrInver += contaString.substring(i - 1, i);
		}

		contaInver = Integer.parseInt(contaStrInver);

		conta = conta + contaInver;

		contaString = conta.toString();

		for (int i = 0; i < contaString.length(); i++) {
			String a;
			a = contaString.substring(i);
			vetor[i] = Integer.parseInt(a);
			System.out.println(vetor[i]);
		}

	}

	public static void main(String[] args) {
		verificador();
	}
}
