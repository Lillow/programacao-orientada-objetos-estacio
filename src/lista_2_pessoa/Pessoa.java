package lista_2_pessoa;

/*********************
1. Escreva um programa em java para armazenar o nome e a idade de pessoas. Nesta 
classe, crie os métodos de leitura (get()) e os de manipulação (set()) para os atributos. 
Crie também um método para retornar os valores dos atributos desta classe como uma 
String (toString()). Crie outra classe PessoaTeste, em seguida instancie um objeto da 
classe Pessoa e passe os dados de nome e idade como parâmetro para os métodos 
criados. Por fim, imprima os dados nesta segunda classe chamando o método que 
retorna uma grande String.
*********************/

public class Pessoa {
	private String name;
	private int cpf;

	public Pessoa() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	

	@Override
	public String toString() {
		return "Pessoa [name=" + name + ", cpf=" + cpf + "]";
	}

}
