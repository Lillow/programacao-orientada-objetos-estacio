/******************************************************************************

18. Criar uma classe onde atenda às necessidades de uma biblioteca que deseja um algoritmo que leia o
nome de um livro que será emprestado, o tipo de usuário(professor ou aluno) e possa imprimir um
recibo conforme a seguir:

*******************************************************************************/
package lista_01_Revis�o_Programa��o_Estruturada;


import java.util.Scanner;
public class Biblioteca
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String nomeUser = new String();
	    String nomeLivro = new String();
	    String tipo = new String();
	    byte permissao;
	    int dias;
	    
	    
		System.out.println("Digite o nome do livro que deseja: ");
		nomeLivro = sc.nextLine();
		System.out.println("Digite o nome de usuário que deseja: ");
		nomeUser = sc.nextLine();
		System.out.println("Qual sua permissao: (1-Professor/0-Aluno)");
		permissao = sc.nextByte();
		if(permissao == 0 || permissao == 1){
		    if(permissao == 0){
		        dias = 5;
		        tipo = "Aluno";
		    } else{
		         dias = 10;
		        tipo = "professor";
		    }
		  System.out.printf("Nome do Livro: %s\n", nomeLivro);
		  System.out.printf("Nome do Usuário: %s\n", nomeUser);
		  System.out.printf("Tipo de Usuário: %s\n", tipo);
		  System.out.printf("Total de dias: %d \n", dias);
		  
		}else{
		      System.out.println("Tipo invalido!");
		}
		
		
		
	}
}
