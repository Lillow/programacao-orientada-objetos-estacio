package lista_03_questao_1_2_funcionario;

/*********************
1. Desenvolva um programa para uma empresa, que pretende controlar quantos 
funcionários existem na empresa. (matrícula, nome, idade, salário). A matrícula seria o 
atributo estático da classe para gerar um número incremental sempre que um novo 
funcionário for cadastrado.

2. Aprimore o programa da questão 1, atribuindo um setor de trabalho para cada 
funcionário. O setor seria composto por um código e um nome. Então cada funcionário 
passaria a ter um objeto do setor ao qual ele fosse alocado. 
Premissas da classe Setor: Além do código e do nome, a classe Setor teria um atributo 
estático para realizar uma contagem de setores criados; O atributo estático ao ser 
incrementado, repassaria este valor para o atributo código que não é estático a fim de 
guardar o valor que foi incrementado. Neste momento também se deve receber o nome 
do Setor e guardar no atributo nome do setor. Por fim, ao imprimir os dados do 
funcionário, também se deve imprimir o código e o nome do setor em que o funcionário 
foi alocado, exatamente como segue abaixo:
*********************/

public class Funcionario {
	private int matricula;
	private String nome;
	private int idade;
	private double salario;
	private String setor = "";
	private static int cont = 0;
	private static String setores[] = {"1-Administração","2-Contabilidade","3-T.I."};

	public Funcionario(String nome, int idade, double salario, int i) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
		this.setor = setores[i -1];
		cont ++;
		matricula = cont;
	}

	public int getMatricula() {
		return matricula;
	}



	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public double getSalario() {
		return salario;
	}



	public void setSalario(double salario) {
		this.salario = salario;
	}



	public String getSetor() {
		return setor;
	}



	public void setSetor(int i) {
		this.setor = setores[i -1];
	}



	@Override
	public String toString() {
		return "[Matricula= " + matricula + " Nome= " + nome + ", Idade= " + idade + ", Salario= " + salario + " Setor= " + setor + "]";
	}
}
