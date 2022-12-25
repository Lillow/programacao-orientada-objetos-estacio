package lista_04_Heranca_e_Construtores_2;

public class CamaroteInferior extends Vip{
 
	public CamaroteInferior(float valor, float valorAdicional) {
		super(valor, valorAdicional);
	}
	
	public void tipoIngresso() {
		System.out.println("Camarote Inferior");
	}

}
