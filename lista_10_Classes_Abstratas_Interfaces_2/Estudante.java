package lista_10_Classes_Abstratas_Interfaces_2;

public class Estudante extends Pessoa {
	private String areaDeEstudo;

	public Estudante(String nome, String areaDeEstudo) {
		super(nome);
		this.areaDeEstudo = areaDeEstudo;
	}

	public String getDescricao() {
		return super.getNome() + ", " + areaDeEstudo;
	}

}
