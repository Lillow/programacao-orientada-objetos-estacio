package lista_12_Classes_Abstratas_Interfaces_2;

public class TestaApi {

	public static void main(String[] args) {
		LinguagemDeProgramacao python = new LinguagemDeProgramacao("Python", "Python");
		python.imprime(true);

		LinguagemDeProgramacao java = new LinguagemDeProgramacao("Oracle", "Java");
		java.imprime(true);

		LinguagemDeProgramacao javaScript = new LinguagemDeProgramacao("Netscape", "JavaScript");
		javaScript.imprime(true);
	}

}
