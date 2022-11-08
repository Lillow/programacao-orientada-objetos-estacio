package lista_15_Thread;

/******************************
 * 2. Crie duas subclasses para Veiculo:
 * 
 * a. Uma chamada Bicicleta, que possuirá o atributo privado nrMarchas (int);
 * 
 * b. Uma chamada Carro, que possuirá o atributo privado combustível (double).
 * Crie para as duas subclasses um construtor vazio e um construtor que
 * inicializa todos os atributos. Lembrando que como elas herdam de Veiculo,
 * também possuem os atributos que Veiculo possuir.
 * 
 * 5. Na classe Bicicleta, seguinte método:
 * 
 * a. incrementarVeloc: método público que recebe um inteiro e soma esse inteiro
 * ao nrMarchas da bicicleta. Além disso, ele aumenta a velocidade da bicicleta
 * no valor da % do número de marchas incrementadas.
 ******************************/

public class Bicicleta extends Veiculo {
	private int nrMarchas;

	public Bicicleta() {
		setTipo(1);
	}

	public Bicicleta(String chassi, double velocidadeMaxima, int nrMarchas) {
		super(chassi, velocidadeMaxima, 1);
		this.nrMarchas = nrMarchas;
	}

	public void incrementarVeloc(int qtdMarcha) {
		double velocPorMarcha = this.getVelocidadeMaxima() / this.nrMarchas;
		this.nrMarchas = this.nrMarchas + qtdMarcha;
		double velocFinal = velocPorMarcha * qtdMarcha;
		this.setVelocidadeMaxima(this.getVelocidadeMaxima() + velocFinal);
	}
}
