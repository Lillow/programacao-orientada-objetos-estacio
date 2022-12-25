package lista_10_Classes_Abstratas_Interfaces_3;

public class PorHoraeComissao extends PorHora implements Commission {
	private double sales;

	public PorHoraeComissao(String name, double valorHora, int numHora, double sales) {
		super(name, valorHora, numHora);
		this.sales = sales;
	}

	public void setVendas(double sales) {
		this.sales = sales;
	}

	public double getPay() {
		return (getValorHora() * getNumHora()) + (sales + sales * COMMISSION_RATE);
	}

}
