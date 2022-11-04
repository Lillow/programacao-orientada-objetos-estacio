package lista_10_Classes_Abstratas_Interfaces_2;

/******************************
 * 2. Criar uma classe abstrata Pessoa que tenha um atributo privado nome, um
 * construtor público para a classe, um método get para o atributo e um método
 * abstrato getDescricao. Criar uma classe Empregado que herde da classe
 * abstrata Pessoa. Esta classe terá o atributo nome da superclasse e um
 * atributo salário como privado desta classe. Os métodos getSalario que
 * retornará o salário e o método getDescricao que retornará o nome e o salário
 * do empregado. Terá também um método atualizaSalario com um argumento do tipo
 * double “porPercentual” que fará o ajuste: salário * porPercentual/100 e
 * atualizará o salário. Criar uma classe Estudante que herda da classe abstrata
 * Pessoa. Esta classe classe passa o nomo para o construtor da superclassse e
 * tem um atributo privado do tipo String para a área de estudo. Terá um método
 * getDescricao que retorna o nome do estudante e a área de estudo. Por fim,
 * criar um classe PessoaTeste para testar a classe Pessoa. Instanciando o
 * objeto pessoa como um array de duas posições. Preenchendo o array de pessoa
 * com objetos Estudante e Empregado. Em seguida imprimir os nomes e descrições
 * de todos os objetos Pessoa. Obs. Para a o objeto Pessoa trazer os dados dos
 * empregados, virá (nome e salário), para os dados dos estudante, virá (nome e
 * área de estudo).
 * 
 ******************************/
public abstract class Pessoa {
	private String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public abstract String getDescricao();
}
