package lista_15_Thread;

import java.util.Scanner;

/*******************************
 * 
 * 6. Crie a classe Oficina:
 * 
 * a. A classe Oficina terá como atributo um array de Veiculos e um double com o
 * valor apurado da oficina.
 * 
 * b. Possuirá os seguintes métodos: - adicionarVeiculoFila(Veiculo v): recebe
 * um veículo e o adiciona no array de veículos; - atenderProximo(): olha o
 * próximo da fila e o atende, isto é,realiza a limpeza(método limpar) econserta
 * o veículo (método ajustar). Em seguida, pergunta ao usuário se ele deseja
 * incrementar o veículo, se a resposta for SIM, ele pede um valor e faz o
 * incremento no veículo (método incrementarVeloc). Em seguida, o método avalia
 * se a classe é um Carro, se for ele pergunta se o mesmo deseja trocar o óleo,
 * caso a resposta seja SIM, troque o óleo do carro (método trocarOleo). Por
 * fim, como o veículo já foi atendido, ele o remove da fila.
 *
 */

public class Oficina {

	private Veiculo[] veiculos;
	private double valorApuradoDaOficina;
	Scanner scan = new Scanner(System.in);

	public void adicionarVeiculoFila(Veiculo v) {
		for (int i = 0; i < veiculos.length + 1; i++) {
			veiculos[i] = v;
		}
	}

	public void atenderProximo(Veiculo v) {
		v.limpar();
		v.ajustar();
		String decisao;
		int valor;

		System.out.println("Deseja incrementar o veículo?");
		decisao = scan.next();
		if (decisao == "Sim" || decisao == "sim") {
			valor = scan.nextInt();
			v.incrementarVeloc(valor);
		}

		if (v.getTipo() == "Carro") {
			v = new Carro();
			System.out.println("Trocar óleo? ");
			decisao = scan.next();
			if (decisao == "Sim" || decisao == "sim") {

			}
		}

	}

	public Veiculo getVeiculos(int i) {
		return veiculos[i];
	}
}
