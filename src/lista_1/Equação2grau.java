package lista_1;

import java.util.Scanner;

//1. Escreva uma classe para calcular as raízes de uma equação do 2º grau (ax2 + bx + c), onde os valores 
//de a, b e c serão fornecidos pelo usuário (considere que a equação possui duas raízes reais).

//delta = b² - 4*a*c
//b = b * -1
//x1 = (b  + delta raiz) / (2*a)
//x2 =  (b - delta raiz) / (2*a)

public class Equação2grau {
	public static void main(String[] args) {
	    Scanner scaner = new Scanner (System.in);
	    double a, b, c, x1, x2 , delta;
	    x1 = 0;
	    x2 = 0;
	    
	    System.out.println("Digite o valor de a: ");
	    a = scaner.nextDouble();
	    System.out.println("Digite o valor de b: ");
	    b = scaner.nextDouble();
	    System.out.println("Digite o valor de c: ");
	    c = scaner.nextDouble();

	    b = Math.pow(b,2);
	    
	    delta = b - 4 * a * c;

	    System.out.println("Delta = " + delta);

	    delta = Math.pow(delta, 0.5);
	    if (delta > 0){
	      x1 = (-b + delta) / (2.0 * a);
	      x2 = (-b - delta) / (2.0 * a);
	      
	    }
	    else if (delta == 0){
	      System.out.println("Delta tem valor nulo, as raizes são iguais");
	    }
	    else{
	      System.out.println("Delta é negativo e a equação não possui raizes reais");
	    }
	    System.out.println("Primeira raiz: " + x1);
	    System.out.println("Segunda raiz: " + x2);
	  }
}
