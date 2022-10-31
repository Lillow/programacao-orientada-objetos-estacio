package lista_06_questao_1_a_7_veiculo;

/******************************
 * 4. Adicione à classe Carro o seguinte método:
 * 
 * a. trocarOleo: método público que imprime uma mensagem dizendo: “O
 * veículoTIPO_DO_VEICULO, com CHASSI trocou o óleo”.
 ******************************/

public class Carro extends Veiculo {
	private double combustivel;

	public Carro() {

	}

	public Carro(String chassi, double velocidadeMaxima, double combustivel) {
		super(chassi, velocidadeMaxima, 0);
		this.combustivel = combustivel;
	}

	public void trocarOleo() {
		System.out.println("O veículo " + getTipo() + " com CHASSI " + getChassi() + " trocou o óleo");
	}
}
