package lista_04_Heranca_e_Construtores_2;

public class Vip extends Ingresso {
	private float valorAdicional;

	public Vip(float valor, float valorAdicional) {
		super(valor);
		this.valorAdicional = valorAdicional;
		setValor(valor + valorAdicional);
	}

	
	public void setValorAdicional(float valorAdicional) {
		this.valorAdicional = valorAdicional;
	}


	public void tipoIngresso() {
		System.out.printf("Ingresso VIP ");
	}

	public void imprimeAdicional() {
		System.out.printf(" adicional de R$ %.2f", valorAdicional);
	}
}
