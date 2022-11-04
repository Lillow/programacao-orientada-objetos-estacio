package lista_06_Heranca_1_a_7;

/******************************
 * 2. Crie duas subclasses para Veiculo:
 * 
 * a. Uma chamada Bicicleta, que possuirá o atributo privado nrMarchas (int);
 * 
 * b. Uma chamada Carro, que possuirá o atributo privado combustível (double).
 * Crie para as duas subclasses um construtor vazio e um construtor que
 * inicializa todos os atributos. Lembrando que como elas herdam de Veiculo,
 * também possuem os atributos que Veiculo possui
 ******************************/

/******************************
 * 5. Na classe Bicicleta, seguinte método:
 * 
 * a. aumentarMarcha: método público que recebe um inteiro e soma esse inteiro
 * ao nrMarchas da bicicleta. Além disso, ele aumenta a velocidade da bicicleta
 * chamando o método da superclasse (incrementarVeloc), e passa o valor inteiro
 * resultante da expressão: ((nrMarchas da bicicleta/velocidademáxima da
 * supleclasse)*100). Neste momento o método da superclasse reportará a nova
 * velocidade.
 ******************************/

public class Bicicleta extends Veiculo {
	private int nrMarchas;

	public Bicicleta() {

	}

	public Bicicleta(String chassi, double velocidadeMaxima, int nrMarchas) {
		super(chassi, velocidadeMaxima, 1);
		this.nrMarchas = nrMarchas;
	}

	public double aumentarMarcha(int marcha) {
		nrMarchas += marcha;
		
		return ((nrMarchas/getVelocidadeMaxima())*100);
		
	}

}
