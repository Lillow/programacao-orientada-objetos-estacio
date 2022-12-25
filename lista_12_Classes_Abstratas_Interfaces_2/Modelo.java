package lista_12_Classes_Abstratas_Interfaces_2;

public abstract class Modelo {
	private String nomeDaEmpresa;

	public Modelo(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public String getNomeDaEmpresa() {
		return nomeDaEmpresa;
	}

	public void setNomeDaEmpresa(String nomeDaEmpresa) {
		this.nomeDaEmpresa = nomeDaEmpresa;
	}

	public abstract String toString();
}
