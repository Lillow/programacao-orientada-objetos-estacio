package lista_05_questao_2_equipamento;

/******************************
2. Implementar o seguinte programa para controle de equipamentos.

a. Implementar uma classe Equipamento com atributo ligado (tipo boolean) e 
com os métodos liga e desliga. O método liga torna o atributo ligado true e o 
método desliga torna o atributo ligado false.

b. Implemente uma classe EquipamentoSonoro que herda as características de 
Equipamentos e que possui atributos volume (tipo short) que varia de 0 a 10 e 
stereo (tipo boolean). A classe ainda deve possuir métodos para ler e alterar o 
volume (getters and setters), além dos métodos mono e stereo. O método 
mono torna o atributo stereo verdadeiro. Ao ligar o equipamento Sonoro 
através do método liga, seu volume é automaticamente ajustado para 5.
******************************/

public class Equipamento {
	private boolean ligado;

	public boolean isLigado() {
		return ligado;
	}

	public void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	public void liga() {
		ligado = true;
	}

	public void desliga() {
		ligado = false;
	}
}
