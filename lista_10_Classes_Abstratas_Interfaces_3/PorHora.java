package lista_10_Classes_Abstratas_Interfaces_3;

public class PorHora extends Empregado {
	private double valorHora;
	private int numHora;

	public PorHora(String name, double valorHora, int numHora) {
		super(name);
		this.valorHora = valorHora;
		this.numHora = numHora;
	}

	public double getValorHora() {
		return valorHora;
	}

	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}

	public int getNumHora() {
		return numHora;
	}

	public void setNumHora(int numHora) {
		this.numHora = numHora;
	}

	public double getPay() {
		return valorHora * numHora;
	}

}
