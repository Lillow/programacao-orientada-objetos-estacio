package lista_14_Exceptions_2;

/******************************
 * 2. Implementar a exceção ExcecaoDivisaoPorZero. Esta exceção será lançada
 * pelo método double calcula(double a, double b) da classe Divisão. Implementar
 * também a aplicação AplicacaoDivisao que recebe dois números informados pelo
 * usuário e faz a divisão do primeiro pelo segundo usando uma chamada ao método
 * calcula da classe Divisão.
 ******************************/

public class ExcecaoDivisaoPorZero extends Exception {
	public ExcecaoDivisaoPorZero(String mensagem) {
		super(mensagem);
	}
}
