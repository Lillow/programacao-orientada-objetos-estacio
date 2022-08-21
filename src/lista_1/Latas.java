/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main
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
		
		System.out.printf("Para pintar este tanque são necessarias %.2f latas que custarão R$ %.2f", latas, custo);
	}
}
