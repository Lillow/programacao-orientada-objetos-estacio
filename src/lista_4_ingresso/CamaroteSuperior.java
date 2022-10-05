package lista_4_ingresso;

public class CamaroteSuperior extends Vip{
	private float valorAdicionalVip;
	

	public CamaroteSuperior(float valor, float valorAdicional,float valorAdicionalVip) {
		super(valor, valorAdicional);
		this.valorAdicionalVip = valorAdicionalVip;
		setValorAdicional(valorAdicional + valorAdicionalVip);
		setValor(valor + valorAdicional + valorAdicionalVip);
		
	}
	
	public void tipoIngresso() {
		System.out.println("Camarote Superior");
	}
}
