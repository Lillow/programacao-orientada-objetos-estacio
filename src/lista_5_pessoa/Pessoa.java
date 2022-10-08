package lista_5_pessoa;

/******************************
 * 1. Escreva as classes como segue abaixo:
 * 
 * a. Uma chamada Pessoa, com atributo nome (tipo String) e sobrenome (tipo
 * string). Cada um desses atributos devem ter métodos para ler e alterar
 * (getters and setters). A classe Pessoa ainda deve ter um método chamado
 * getNomeCompleto que não possui parâmetros de entrada e que retorna a
 * concatenação do atributo nome com o atributo sobrenome. Além disto, a classe
 * deve possuir um construtor sem parâmetros e um outro construtor que recebe
 * como parâmetros o nome e o sobrenome da pessoa e altera respectivamente os
 * atributos nome e sobrenome.
 * 
 * b. Uma subclasse chamada Funcionario. A classe Funcionario deve ter os
 * atributos matricula (tipo int) e salário (tipo double), com seus respectivos
 * métodos para leitura e alteração (getters and setters). O Salário de um
 * funcionário jamais poderá ser negativo. Todo funcionário recebe seu salário
 * em duas parcelas, sendo 60% na primeira e 40% na segunda parcela. Assim,
 * escreva os métodos getSalarioPrimeiraParcela que retorna o valor da primeira
 * parcela do salário (60%) e getSalarioSegundaParcelaque retorna o valor da
 * segunda parcela do salário (40%).
 * 
 * c. Uma subclasse de Funcionário chamada Professor. Todo professor recebe seu
 * salário em uma única parcela. Assim, deve-se sobrescrever os métodos
 * getSalárioPrimeiraParcela e getSalarioSegundaParcela. O método
 * getSalárioPrimeiraParcela da classe Professor deve retornar o valor integral
 * do salário do professor e o método getSalarioSegundaParcela deve retornar o
 * valor zero.
 * 
 * d. Crie uma classe UsaPessoa que instância os seguintes objetos: Passoa
 * 1(Pessoa) nome: José sobrenome: Manoel
 * 
 * Passoa 1(Funcionário) nome: Leandro sobrenome: Charles salario: 2000.00
 * 
 * Passoa 1(Professor) nome: Rita sobrenome: Cassia salario: 500.00 Depois
 * execute as seguintes operações obedecendo a sequência das ordens:
 * 
 * e. Exibir a saída do método getNomeCompleto para os 3 objetos. f. Exibir a
 * saída dos métodos getSalárioPrimeiraParcela egetSalarioSegundaParcela para os
 * objetos dos itens pessoa2epessoa3.
 ******************************/

public class Pessoa {
	private String nome;
	private String sobrenome;

	public Pessoa() {
	}

	public Pessoa(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomeCompleto() {
		return nome + " " + sobrenome;
	}

}
