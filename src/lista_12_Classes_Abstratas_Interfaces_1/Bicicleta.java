package lista_12_Classes_Abstratas_Interfaces_1;

public class Bicicleta extends TransporteTerrestre implements Conduzivel {
	public boolean estaParado() {
		return getVelocidadeAtual() == 0 ? true : false;
	}

	public void estacionar() {

	}

	public void curvar(float andulo) {

	}

	public void pedalar() {
		setVelocidadeAtual(getVelocidadeAtual() + 1);

	}
}
