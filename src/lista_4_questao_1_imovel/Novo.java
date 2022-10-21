package lista_4_questao_1_imovel;

public class Novo extends Imovel {
	private double precoAdicional;

	public Novo(String endereco, double preco, double precoAdicional) {
		super(endereco, preco);
		this.precoAdicional = precoAdicional;

	}

	public double getPrecoAdicional() {
		return precoAdicional;
	}

	public void setPrecoAdicional(double precoAdicional) {
		this.precoAdicional = precoAdicional;

	}

}
