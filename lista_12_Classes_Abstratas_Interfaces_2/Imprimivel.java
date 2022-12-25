package lista_12_Classes_Abstratas_Interfaces_2;

/******************************
 * 2. Criar um programa que contemple interfaces e classes abstratas além de
 * outras classes como segue o roteiro abaixo:
 * 
 * a. Crie uma interface pública de nome Imprimivel, em um pacote a sua escolha.
 * Defina duas constantes de classe: IMPRIME_NOME_DA_EMPRESA com valor true e
 * NAO_IMPRIME_NOME_DA_EMPRESA com valor false. Defina também um método público
 * e abstrato que não retorne valor chamado imprime e que receba um parâmetro do
 * tipo boolean.
 * 
 * b. Crie uma classe abstrata de nome Modelo, no mesmo pacote. Essa classe deve
 * definir uma variável de instância nomeDaEmpresa, privada com métodos get e
 * set públicos, um método toString abstrato e um construtor que receba como
 * parâmetro o nome da empresa e inicialize a variável de instância equivalente.
 * 
 * c. Crie uma classe LinguagemDeProgramacao que estenda Modelo e implemente
 * Imprimivel. Essa classe deve definir uma variável de instância
 * nomeDaLinguagem privada e seus métodos get e set públicos. Deve definir
 * também um construtor que acione o construtor da superclasse e inicialize a
 * variável de instância criada na classe. Por último, deve ser implementado o
 * método imprime que condicionará a impressão do nome da empresa ao valor do
 * argumento recebido com parâmetro.
 * 
 * d. Crie uma classe Testa API que instancia objetos da classe
 * LinguagemDeProgramacao, usando diferentes tipos de referência, atribui
 * valores a suas variáveis de instância e imprime os objetos, usando o método
 * imprime.
 ******************************/

public interface Imprimivel {
	final boolean IMPRIME_NOME_DA_EMPRESA = true;
	final boolean NAO_IMPRIME_NOME_DA_EMPRESA = false;

	public void imprime(boolean a);

}
