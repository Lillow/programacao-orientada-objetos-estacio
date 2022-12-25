package lista_04_Heranca_e_Construtores_2;

import java.util.Scanner;

public class ComprarIngresso {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Ingresso ingresso = new Ingresso(0) {

			@Override
			public void tipoIngresso() {

			}

			@Override
			public void imprimeAdicional() {

			}

		};
		byte escolha;
		byte escolha2 = 0;

		System.out.println("Digite 1 para ingresso normal e 2 para ingresso VIP");
		escolha = scan.nextByte();

		switch (escolha) {
		case 1: {
			ingresso = new Normal(200);
			ingresso.tipoIngresso();
			System.out.println();
			break;
		}

		case 2: {
			ingresso = new Vip(200, 200);
			ingresso.tipoIngresso();
			System.out.println();
			System.out.println("Digite 1 para Camarote Inferior e 2 Camarote Superior");
			escolha2 = scan.nextByte();
			if (escolha2 == 1) {
				ingresso = new CamaroteInferior(200, 200);
				ingresso.tipoIngresso();
			} else if (escolha2 == 2) {
				ingresso = new CamaroteSuperior(200, 200, 150);
				ingresso.tipoIngresso();
			} else {
				System.out.println("Opção inválida");
			}
			break;

		}
		default:
			System.out.println("Opção inválida.");
			;
		}
		System.out.print("Valor do ingresso ");
		ingresso.imprimeValor();

		if (escolha == 2) {
			ingresso.imprimeAdicional();
		}
	}
}
