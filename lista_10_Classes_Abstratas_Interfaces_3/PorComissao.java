package lista_10_Classes_Abstratas_Interfaces_3;

public class PorComissao extends Empregado implements Commission {
	private double sales;

	public PorComissao(String name, double sales) {
		super(name);
		this.sales = sales;
	}

	public void setVendas(double sales) {
		this.sales = sales;
	}

	public double getPay() {
		return sales + sales * COMMISSION_RATE;
	}
}
