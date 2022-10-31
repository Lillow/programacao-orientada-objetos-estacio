package lista_04_questao_1_imovel;

import java.util.Scanner;

public class VendaImovel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		byte escolha;
		String endereco;
		double preco;

		System.out.println("Escolha 1 para imóvel novo e 2 para imóvel usado");
		escolha = scan.nextByte();

		switch (escolha) {
		
		case 1: {
			System.out.println("Novo imóvel\n");
			System.out.print("Endereço: ");
			endereco = scan.next();
			System.out.print("Preço: ");
			preco = scan.nextDouble();
			
			Novo imovel = new Novo(endereco, preco, 20);
			imovel.setPrecoAdicional(imovel.getPrecoAdicional() / 100 * preco);
			preco = preco + imovel.getPrecoAdicional();
			
			System.out.printf("Preço R$%.2f com acrescimo de R$%.2f", preco, imovel.getPrecoAdicional());
			break;
		}

		case 2: {
			System.out.println("Imóvel Usádo\n");
			System.out.print("Endereço: ");
			endereco = scan.next();
			System.out.print("Preço: ");
			preco = scan.nextDouble();
			
	
			Usado imovel = new Usado(endereco, preco, 30);
			imovel.setPrecoDesconto(imovel.getPrecoDesconto() / 100 * preco);
			preco = preco - imovel.getPrecoDesconto();
			
			System.out.printf("Preço R$%.2f com desconto de R$%.2f", preco, imovel.getPrecoDesconto());
			break;
		}
		default:
			System.out.println("Opção inválida.");
		}

		
	}

}
