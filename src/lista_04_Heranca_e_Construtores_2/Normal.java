package lista_04_Heranca_e_Construtores_2;

public class Normal extends Ingresso {

	public Normal(float valor) {
		super(valor);
	}

	public void tipoIngresso() {
		System.out.printf("Ingresso Normal ");
	}

	@Override
	public void imprimeAdicional() {

	}

}
