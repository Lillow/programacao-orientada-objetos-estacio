package lista_01;

import java.util.Scanner;

//14. Escrever uma classe em que receba três valores (a, b e c) e podem ser os comprimentos dos lados de 
//um triângulo. Se for, verifique se o triângulo é um equilátero, isósceles ou escaleno. Caso não seja, 
//também informar que compõe um triângulo

public class Triangulo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Entre com o 1º número:  ");
		a = scan.nextInt();
		
		System.out.println("Entre com o 2º número:  ");
		b = scan.nextInt();
		
		System.out.println("Entre com o 3º número:  ");
		c = scan.nextInt();
		
		if (a + b < c || b + c < a || a + c < b) {
			System.out.println("Valores inválidos");
		}else {
			if (a == b && b == c) {
				System.out.println("Os valores farma um triângulo equilátero.");
			} else if (a == b || b == c || c == a) {
				System.out.println("Os valores farma um triângulo isosceles.");
			}else {
				System.out.println("Os valores farma um triângulo escaleno.");
			}
		}
	}
}
