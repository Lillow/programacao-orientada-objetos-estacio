package lista_01_Revisão_Programação_Estruturada;

import java.util.Scanner;

/******************************
 * 19. Uma pousada estipulou o preço para sua diária de R$ 300,00 e mais uma
 * taxa de serviços de: - R$ 15,00 se o número de dias for menor que 10; - R$
 * 8,00 se o número de dias for maior ou igual a 10. Criar uma classe que colete
 * o número da conta do cliente, o nome do cliente e o número de dias de
 * hospedagem para várias pessoas que desejem hospedar. A coleta de dados se
 * encerra quando o usuário informar o número de conta “X”. No final imprima o
 * total ganho pela pousada para quem se hospedou com menos e maior ou igual a
 * 10 dias.
 ******************************/

public class Q_19_Pousada {

	public static void ospedar() {
		String nome, numeroConta = "";
		int numeroDias = 0;
		final double diaria = 300;
		double taxaDeServico = 0;
		double totalGanhoMenor10 = 0;
		double totalGanhoMaior10 = 0;
		double totalGanho = 0;
		Scanner scan = new Scanner(System.in);

		while (true) {
			System.out.print("Número da conta: ");
			numeroConta = scan.next();
			if (numeroConta.equalsIgnoreCase("X")) {
				break;
			}
			System.out.print("Nome: ");
			nome = scan.next();
			System.out.print("Número de dias de hospedagem: ");
			numeroDias = scan.nextInt();
			System.out.println();
			if (numeroDias < 10) {
				taxaDeServico = 15.00;
				totalGanhoMenor10 += diaria + taxaDeServico;
			} else if (numeroDias >= 10) {
				taxaDeServico = 8.00;
				totalGanhoMaior10 += diaria + taxaDeServico;
			}
			totalGanho += diaria + taxaDeServico;
		}
		System.out.println("A pousada ganhou um total de R$" + totalGanho);
		System.out.printf(
				"sendo R$%.2f para clientes que se hopedaram menos de 10 dias e R$%.2f para que se hospedaram 10 dias ou mais.",
				totalGanhoMenor10, totalGanhoMaior10);
	}

	public static void main(String[] args) {
		ospedar();
	}
}
