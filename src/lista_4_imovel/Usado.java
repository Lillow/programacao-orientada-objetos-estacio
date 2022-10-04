package lista_4_imovel;

public class Usado extends Imovel {
	private double precoDesconto;

	public Usado(String endereco, double preco, double precoDesconto) {
		super(endereco, preco);
		this.precoDesconto = precoDesconto;
	}

	public double getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}

}
