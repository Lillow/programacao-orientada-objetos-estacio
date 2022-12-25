package lista_12_Classes_Abstratas_Interfaces_1;

public class Bicicleta extends TransporteTerrestre implements Conduzivel {
	public boolean estaParado() {
		return getVelocidadeAtual() == 0 ? true : false;
	}

	public void estacionar() {
		System.out.println("Estacionando.");
	}

	public void curvar(float angulo) {
		System.out.println("Curva " + angulo + "°");
	}

	public void pedalar() {
		setVelocidadeAtual(getVelocidadeAtual() + 1);

	}
}
