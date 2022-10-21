package lista_9_quetao_2_AlunoEscola;

public class Principal {

	public static void main(String[] args) {
		AlunoEscola a1 = new AlunoEscola();
		AlunoGraduacao a2 = new AlunoGraduacao();
		AlunoPosGraduacao a3 = new AlunoPosGraduacao();

		a1.alunoMsg("Ana");
		a2.alunoMsg("Marta", "ADS");
		a3.alunoMsg("André", "Engenharia de software");
	}

}
