package lista_15_Thread;

/******************************
 * 1. Crie uma classe chamada Veiculo, que conterá os seguintes atributos
 * privados: chassi (String), tipo (carro ou bicicleta - String) e
 * velocidadeMaxima (double). Essa classe deverá possuir um construtor vazio e
 * um construtor que inicialize todos os atributos.
 * 
 * 3. Adicione à classe Veiculo os seguintes métodos:
 * 
 * a.limpar: método público que ao ser chamado imprime a seguinte mensagem: “O
 * veículo TIPO_DO_VEICULO” está sendo limpo;
 * 
 * b.ajustar: método público que ao ser chamado imprime uma mensagem dizendo: “O
 * veículo TIPO_DO_VEICULO” está sendo ajustado;
 * 
 * c.incrementarVeloc: método público que recebe um valor inteiro e que soma
 * esse inteiro à velocidadeMaxima do veículo.
 * 
 ******************************/

public class Veiculo {
	private String chassi;
	private final String[] tipos = { "Carro", "Bicicleta" };
	private String tipo;
	private double velocidadeMaxima;

	public Veiculo() {

	}

	public Veiculo(String chassi, double velocidadeMaxima, int tipo) {
		this.chassi = chassi;
		this.velocidadeMaxima = velocidadeMaxima;
		this.tipo = tipos[tipo];
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(int i) {
		tipo = tipos[i];

	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double setVelocidadeMaxima) {
		velocidadeMaxima = setVelocidadeMaxima;
	}

	public void limpar() {
		System.out.println("O vículo " + this.tipo + " está sendo limpo.");
	}

	public void ajustar() {
		System.out.println("O veículo " + this.tipo + " está sendo ajustado");
	}

	public void incrementarVeloc(int velocidade) {
		velocidadeMaxima += velocidade;
	}
}
