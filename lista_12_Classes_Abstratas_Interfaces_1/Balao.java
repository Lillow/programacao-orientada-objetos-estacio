package lista_12_Classes_Abstratas_Interfaces_1;

public class Balao extends TransporteAereo {
	private int pesoLargard;

	public int getPesoLargard() {
		return pesoLargard;
	}

	public void setPesoLargard(int pesoLargard) {
		this.pesoLargard = pesoLargard;
	}

	public boolean estaParado() {
		return getVelocidadeAtual() == 0 ? true : false;
	}

	public void subir(int metros) {
		setAltitudeAtual(getAltitudeAtual() + metros);
	}

	public void descer(int metros) {
		setAltitudeAtual(getAltitudeAtual() - metros);
	}

	public void largarPeso(float peso) {
		pesoLargard += peso;
	}

	public void aquecerAr(float temp) {
		System.out.println("Aquecendo a " + temp + "°");
	}

}
