package lista_04_Heranca_e_Construtores_2;

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
