package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

//8. Escreva uma classe que utilize estrutura switch-case e receba o preço e a quantidade de um produto 
//e realize a multiplicação para obter o valor parcial a ser pago pelo produto. Atribua um código de 
//pagamento baseado na tabela abaixo para aumentar ou reduzir o valor e gerar o valor total a ser 
//pago pelo produto.

public class PrecoProdudo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double preco, precoPar;
		int quant, codigo;
		
		System.out.println("Digite o preço: ");
		preco = sc.nextDouble();
		System.out.println("Digite o quantidade: ");
		quant = sc.nextInt();
		System.out.println("Digite o cídigo: ");
		codigo = sc.nextInt();
		
		precoPar = preco * quant;
		
		switch (codigo) {
		case 1: {
			System.out.println("À vista em dinheiro ou cheque, 10% de desconto R$" + (precoPar - precoPar * 0.1));
			break;
		}
		
		case 2: {
			System.out.println("À vista no cartão de crédito, 5% de desconto R$" + (precoPar - precoPar * 0.05));
			break;
		}
		
		case 3: {
			System.out.println("Em duas vezes,  sem juros R$" + (precoPar / 2));
			break;
		}
		
		case 4: {
			System.out.println("Em três vezes, preço normal mais juros de 15% R$" + ((precoPar * 0.15 + precoPar)/3));
			break;
		}
		default:
			System.out.println("Forma de pagamento inválida.");;
		}
	}
}
