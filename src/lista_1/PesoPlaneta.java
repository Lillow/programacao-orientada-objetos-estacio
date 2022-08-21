package lista_1;

import java.util.Scanner;

//7. Escrever uma classe que utilize a estrutura switch-case para receber um peso (Kg) da Terra e um 
//código de um plante conforme a tabela abaixo para imprimir o valor do seu peso neste plante. A 
//tabela abaixo descreve a relação dos planetas e suas gravidades relativas à da Terra

public class PesoPlaneta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String planeta[] = {"Mercurio", "Venus", "Marte", "Jupiter", "Saturno", "Urano"};
		double gravidadeR[] = {0.37, 0.88, 0.38, 2.64, 1.15, 1.17};
		int codigo;
		double peso, pesoFinal;
		
		System.out.println("Digite o peso no planeta terra: ");
		peso = sc.nextDouble();
		System.out.println("Digite o código do planeta: ");
		codigo = sc.nextInt();
		
		pesoFinal = (peso / 10) * gravidadeR[codigo-1];
		
		System.out.printf("O peso %.2f na terra equivale ao peso %.2f no planeta %s", peso, pesoFinal, planeta[codigo-1] );
	}
}
