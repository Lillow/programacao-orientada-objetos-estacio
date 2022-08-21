package lista_1;

import java.util.Scanner;

//13. Escreva uma classe que obtenha o máximo divisor comum (MDC) entre dois números fornecidos

public class Mdc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o 1º número:  ");
		int valor1 = scan.nextInt();
		System.out.println("Entre com o 2º número:  ");
		int valor2 = scan.nextInt();

		int resto;
		while (valor2 != 0) {
			resto = valor1 % valor2;
			valor1 = valor2;
			valor2 = resto;
		}
		System.out.println("MDC = " + valor1);
	}
}
