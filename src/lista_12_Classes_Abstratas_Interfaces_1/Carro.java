package lista_12_Classes_Abstratas_Interfaces_1;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {
	private int numeroCilindros;

	public boolean estaParado() {
		return getVelocidadeAtual() == 0 ? true : false;
	}

	public void estacionar() {

	}

	public void curvar(float andulo) {

	}

	public void abastecer(int qtdLitros) {

	}

	public void ligarMotor() {

	}

	public void embreiar() {

	}

}
