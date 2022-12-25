package lista_12_Classes_Abstratas_Interfaces_2;

public class LinguagemDeProgramacao extends Modelo implements Imprimivel {
	private String nomeDaLinguagem;

	public LinguagemDeProgramacao(String nomeDaEmpresa, String nomeDaLinguagem) {
		super(nomeDaEmpresa);
		this.nomeDaLinguagem = nomeDaLinguagem;
	}

	public String getNomeDaLinguagem() {
		return nomeDaLinguagem;
	}

	public void setNomeDaLinguagem(String nomeDaLinguagem) {
		this.nomeDaLinguagem = nomeDaLinguagem;
	}

	public void imprime(boolean a) {
		if (a == true) {
			System.out.println(toString());
		}
	}

	public String toString() {
		return "Empresa: " + getNomeDaEmpresa() + "\nLinguagem: " + nomeDaLinguagem + "\n";
	}
}
