package lista_5_transporte;

/**********************
3. Implemente as classe abaixo:

a. Uma classe Transporte com atributo ligado (tipo boolean) e velocidade (tipo 
int) e métodos liga e desliga. O Método liga torna o atributo ligado true e o 
método desliga torna o atributo ligado false, além de tornar velocidade zero. 
Crie também métodos getters and setters para modificar o atributo velocidade, 
sendo que a velocidade não pode ser negativa.

b. Uma subclasse de Transporte chamada Carro. Carro de ter o atributo 
quilometragem (tipo int) e os métodos necessários para ler e gravar (getters
and setters). A quilometragem não pode ser negativa, nem ultrapassar o valor 
de 999999. A velocidade do Carro pode ser negativa, nem ultrapassar 200.
**********************/

public class Transporte {
	private boolean ligado;
	private int velocidade;
	
	public void liga() {
		ligado = true;
	}
	
	public void desliga() {
		ligado = false;
		velocidade = 0;
	}
	
	public boolean getLigado() {
		return this.ligado;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		if (velocidade >= 0) {			
			this.velocidade = velocidade;
		}
		
		else {
			System.out.println("Valor de velocidade inválido");
		}
	}
	
	
}
