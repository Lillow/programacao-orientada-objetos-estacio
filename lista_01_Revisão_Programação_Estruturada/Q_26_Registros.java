package lista_01_Revisão_Programação_Estruturada;

import java.util.ArrayList;
import java.util.HashMap;

/********************************
 * 26. Crie um programa que armazene os dados de registros do aluno abaixo
 * contendo 20 registros. Depois elabore um algoritmo capaz de responder às
 * questões, sendo que os registros estão organizados por série, turma e nome.
 * 
 * a. Qual a porcentagem de alunos aprovados e reprovados por turma, totalizados
 * por série?
 * 
 * b. Qual a porcentagem de alunos do sexo masculino e do sexo feminino por
 * turma, totalizados por série?
 * 
 * c. Qual a média das idades de cada uma das séries?
 * 
 * d. Qual a porcentagem de alunos (estrangeiros) de outras cidades na escola?
 * 
 * e. Qual a porcentagem de alunos repetentes em cada turma?
 * 
 * f. Quais os cinco melhores alunos de cada série (em ordem crescente)?
 ********************************/

public class Q_26_Registros {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> alunos = new ArrayList<HashMap<String, Object>>();

		// preenche a lista de alunos com os registros
		HashMap<String, Object> aluno1 = new HashMap<String, Object>();
		aluno1.put("matricula", "001");
		aluno1.put("nome", "Ana");
		aluno1.put("serie", "1a");
		aluno1.put("turma", "A");
		aluno1.put("sexo", "F");
		aluno1.put("media", 7.5);
		aluno1.put("aprovado", true);
		aluno1.put("anoNascimento", 2005);
		aluno1.put("naturalidade", "São Paulo");
		alunos.add(aluno1);

		HashMap<String, Object> aluno2 = new HashMap<String, Object>();
		aluno2.put("matricula", "002");
		aluno2.put("nome", "Bruno");
		aluno2.put("serie", "1a");
		aluno2.put("turma", "A");
		aluno2.put("sexo", "M");
		aluno2.put("media", 8.0);
		aluno2.put("aprovado", true);
		aluno2.put("anoNascimento", 2005);
		aluno2.put("naturalidade", "Rio de Janeiro");
		alunos.add(aluno2);

		HashMap<String, Object> aluno3 = new HashMap<String, Object>();
		aluno3.put("matricula", "003");
		aluno3.put("nome", "Carlos");
		aluno3.put("serie", "1a");
		aluno3.put("turma", "B");
		aluno3.put("sexo", "M");
		aluno3.put("media", 6.0);
		aluno3.put("aprovado", false);
		aluno3.put("anoNascimento", 2005);
		aluno3.put("naturalidade", "Bahia");
		alunos.add(aluno3);

		HashMap<String, Object> aluno4 = new HashMap<String, Object>();
		aluno4.put("matricula", "004");
		aluno4.put("nome", "Daniela");
		aluno4.put("serie", "1a");
		aluno4.put("turma", "B");
		aluno4.put("sexo", "F");
		aluno4.put("media", 5.5);
		aluno4.put("aprovado", false);
		aluno4.put("anoNascimento", 2005);
		aluno4.put("naturalidade", "São Paulo");
		alunos.add(aluno4);

		HashMap<String, Object> aluno5 = new HashMap<String, Object>();
		aluno5.put("matricula", "005");
		aluno5.put("nome", "Eduardo");
		aluno5.put("serie", "1a");
		aluno5.put("turma", "C");
		aluno5.put("sexo", "M");
		aluno5.put("media", 9.0);
		aluno5.put("aprovado", true);
		aluno5.put("anoNascimento", 2005);
		aluno5.put("naturalidade", "São Paulo");
		alunos.add(aluno5);
		
		// a. Qual a porcentagem de alunos aprovados e reprovados por turma, totalizados por série?
		HashMap<String, HashMap<String, Integer>> aprovadosPorTurma = new HashMap<String, HashMap<String, Integer>>();
		for (HashMap<String, Object> aluno : alunos) {
		    String serie = (String) aluno.get("serie");
		    String turma = (String) aluno.get("turma");
		    boolean aprovado = (boolean) aluno.get("aprovado");

		    if (!aprovadosPorTurma.containsKey(serie)) {
		        aprovadosPorTurma.put(serie, new HashMap<String, Integer>());
		    }

		    if (!aprovadosPorTurma.get(serie).containsKey(turma)) {
		        aprovadosPorTurma.get(serie).put(turma, 0);
		    }

		    if (aprovado) {
		        int qtdAprovados = aprovadosPorTurma.get(serie).get(turma);
		        aprovadosPorTurma.get(serie).put(turma, qtdAprovados + 1);
		    } else {
		        int qtdReprovados = aprovadosPorTurma.get(serie).get(turma);
		        aprovadosPorTurma.get(serie).put(turma, qtdReprovados + 1);
		    }
		}

		for (String serie : aprovadosPorTurma.keySet()) {
		    System.out.println("Série " + serie + ":");
		    HashMap<String, Integer> aprovadosPorTurmaSerie = aprovadosPorTurma.get(serie);

		    for (String turma : aprovadosPorTurmaSerie.keySet()) {
		        int totalAlunos = 0;
		        int totalAprovados = 0;
		        int totalReprovados = 0;

		        for (HashMap<String, Object> aluno : alunos) {
		            String serieAluno = (String) aluno.get("serie");
		            String turmaAluno = (String) aluno.get("turma");

		            if (serieAluno.equals(serie) && turmaAluno.equals(turma)) {
		                totalAlunos++;

		                boolean aprovado = (boolean) aluno.get("aprovado");
		                if (aprovado) {
		                    totalAprovados++;
		                } else {
		                    totalReprovados++;
		                }
		            }
		        }

		        System.out.println("Turma " + turma + ":");
		        System.out.println("Aprovados: " + totalAprovados + " (" + (totalAprovados*100/totalAlunos) + "%)");
		        System.out.println("Reprovados: " + totalReprovados + " (" + (totalReprovados*100/totalAlunos) + "%)");
		    }
		}
	}
}
