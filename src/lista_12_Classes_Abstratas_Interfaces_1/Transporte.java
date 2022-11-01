package lista_12_Classes_Abstratas_Interfaces_1;

/******************************
 * 1. Considerando o diagrama abaixo, realize as devidas implementações:
 * 
 * a. Criar uma interface com o nome Motorizado contendo os métodos ligarMotor()
 * e abastecer(int qtdLitros). Ambos não retornam nada.
 * 
 * b. Nas classes Aviao e Carro, implemente a interface Motorizado.
 * 
 * c. Para realizar uma verificação de teste, escreva um pequeno programa capaz
 * de averiguar se está tudo correto.
 * 
 * d. Criar outra interface chamada Conduzivel contendo o método curvar(float
 * ângulo) que não retorna nada.
 * 
 * e. Implemente a interface Conduzivel nas classes Aviao, Carro e Bicicleta.
 * 
 * f. Ajuste o programa de teste para contemplar estas ultimas alterações.
 ******************************/

public abstract class Transporte {
	private String nome;
	private int numeroPassageiro;
	private int velocidadeAtual;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroPassageiro() {
		return numeroPassageiro;
	}

	public void setNumeroPassageiro(int numeroPassageiro) {
		this.numeroPassageiro = numeroPassageiro;
	}

	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(int velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public abstract boolean estaParado();
}
