package lista_15_Thread_1_a_7;

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
	private Veiculo veiculos[] = new Veiculo[100];
	private double valorApurado;
	private int finalFila = 0;
	private int inicioFila = 0;

	public Oficina() {
	}

	public void adicionarVeiculoFila(Veiculo v) {
		this.veiculos[finalFila] = v;
		this.finalFila++;
	}

	public void atenderProximo() {
		this.veiculos[inicioFila].limpar();
		this.veiculos[inicioFila].ajustar();

		Scanner scan = new Scanner(System.in);
		System.out.println("Você deseja incrementar o veículo?");
		String respostaIncremento = scan.next();

		if (respostaIncremento.equalsIgnoreCase("sim") || respostaIncremento.equalsIgnoreCase("Sim")) {
			System.out.println("Qual o valor do incremento?");
			int valorIncremento = scan.nextInt();
			this.veiculos[inicioFila].incrementarVeloc(valorIncremento);
		}
		if (this.veiculos[inicioFila] instanceof Carro) {
			System.out.println("Deseja trocar o óleo?");
			String respostaOleo = scan.next();
			if (respostaOleo.equalsIgnoreCase("sim") || respostaOleo.equalsIgnoreCase("Sim")) {
				Carro carro = (Carro) this.veiculos[inicioFila];
				carro.trocarOleo();
			}
		}

		this.veiculos[inicioFila] = null;
		this.inicioFila++;
	}
}
