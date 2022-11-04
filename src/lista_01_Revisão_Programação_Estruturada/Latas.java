/******************************************************************************

3. Escreva uma classe para calcular a quantidade de latas de tinta e o custo para pintar um tanque no
formato cil√≠ndrico. Para isto s√£o fornecidos o raio e a altura desse cilindro. Sabendo que:

*******************************************************************************/
package lista_01_Revis„o_ProgramaÁ„o_Estruturada;

import java.util.Scanner;

public class Latas
{

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    double altura, raio, areaTotal, pi = 3.14;
	    double custo, litros, latas;
	    
		System.out.println("Digite a altura do tanque: ");
		altura = sc.nextDouble();
		System.out.println("Digite o raio do tanque: ");
		raio = sc.nextDouble();
		
		areaTotal = (2*(pi*Math.pow(raio,2.0)))+(2*pi*raio*altura);
		litros = areaTotal/3;
		latas = litros/5;
		custo = latas*50;
		
		System.out.printf("Para pintar este tanque s√£o necessarias %.2f latas que custar√£o R$ %.2f", latas, custo);
	}
}
