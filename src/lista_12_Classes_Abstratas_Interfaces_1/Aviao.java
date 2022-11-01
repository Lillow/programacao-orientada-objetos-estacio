package lista_12_Classes_Abstratas_Interfaces_1;

public class Aviao extends TransporteAereo implements Motorizado, Conduzivel {
	private int numeroMotores;

	public int getNumeroMotores() {
		return numeroMotores;
	}

	public void setNumeroMotores(int numeroMotores) {
		this.numeroMotores = numeroMotores;
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

	public void curvar(float andulo) {

	}

	public void abastecer(int qtdLitros) {

	}

	public void ligarMotor() {

	}

}
