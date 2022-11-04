package lista_09_Sobrescrita_e_Sobrecarga_de_Metodos_2;

public class AlunoPosGraduacao extends AlunoGraduacao {
	public void alunoMsg(String nome, String nomeCurso) {
		System.out.println(nome + " aluno(a) do curso de Pós Graduação em " + nomeCurso);
	}
}
