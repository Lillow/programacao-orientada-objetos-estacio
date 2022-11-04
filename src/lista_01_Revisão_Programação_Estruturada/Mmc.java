package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

//12. Escreva uma classe que obtenha o mínimo múltiplo comum (MMC) entre dois números fornecidos.

public class Mmc {
	public static int mmc(int num1, int num2) {

	    int resto, a, b;

	    a = num1;
	    b = num2;

	    do {
	        resto = a % b;

	        a = b;
	        b = resto;

	    } while (resto != 0);

	    return ( num1 * num2) / a;
	}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, resto, mmc;
		
		System.out.println("Entre com o 1º número:  ");
		num1 = scan.nextInt();
		
		System.out.println("Entre com o 2º número:  ");
		num2 = scan.nextInt();
		
		mmc = mmc(num1,num2);
		
		System.out.println(mmc);
		
	}
}
