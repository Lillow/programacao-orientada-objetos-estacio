package lista_12_Classes_Abstratas_Interfaces_1;

public abstract class TransporteTerrestre extends Transporte {
	private String tipo;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public abstract void estacionar();
}
