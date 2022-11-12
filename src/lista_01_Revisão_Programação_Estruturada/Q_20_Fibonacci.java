package lista_01_Revisão_Programação_Estruturada;

/******************************
 * 20. Criar uma classe que imprima os quinze primeiros termos da série de
 * Fibonacci, observando que os dois primeiros termos desta séria são 1 e 1 e os
 * demais serão gerados a partir da soma dos anteriores. Exemplo: 1 + 1 -> 2
 * terceiro termo; 1 + 2 -> 3 terceiro termo, etc.
 ******************************/

public class Q_20_Fibonacci {
	public static void main(String[] args) {
		int primeiroTermo = 1, segundoTermo = 1, terceiroTermo = 0;

		for (int i = 0; i < 15; i++) {
			terceiroTermo = primeiroTermo + segundoTermo;
			System.out.println(primeiroTermo + " + " + segundoTermo + " -> " + terceiroTermo);
			primeiroTermo = segundoTermo;
			segundoTermo = terceiroTermo;
		}

	}
}
