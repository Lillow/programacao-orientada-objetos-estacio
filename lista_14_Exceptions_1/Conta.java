package lista_14_Exceptions_1;

/******************************
 * 1. Criar um projeto para cadastramento de contas onde deve ser Implementado o
 * tratamento de exceções para o Cadastro destas Contas.
 * 
 * a. Em algum lugar no projeto devem existir algumas funcionalidades:
 * 
 * i. Os métodos set das classes básicas de negócio (Conta, ContaAPagar,
 * ContaAReceber, Cliente e Fornecedor) lançarão exceções do tipo
 * ExcecaoDadoInvalido quando o dado passado como parâmetro não for válido.
 * 
 * ii. O método inserir da classe CadastroContas deve lançar a exceção
 * ExcecaoCadastroCheio quando não puder mais inserir contas no array e a
 * exceção ExcecaoContaJaExistente quando uma conta com um mesmo número já
 * estiver cadastrada.
 * 
 * iii. O método buscar da classe CadastroContas deve lançar a exceção
 * ExcecaoContaInexistente quando a conta que se deseja buscar não estiver
 * cadastrada.
 ******************************/

public class Conta {
	private String cliente, fornecedor;
	private int numConta;
	private double contaApagar;
	private double contaAreceber;

	public Conta() {

	}

	public String getCliente() throws ExcecaoDadoInvalido {
		return cliente;
	}

	public void setCliente(String cliente) throws ExcecaoDadoInvalido {
		this.cliente = cliente;
	}

	public String getFornecedor() throws ExcecaoDadoInvalido {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) throws ExcecaoDadoInvalido {
		this.fornecedor = fornecedor;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public double getContaApagar() {
		return contaApagar;
	}

	public void setContaApagar(double contaApagar) {
		this.contaApagar = contaApagar;
	}

	public double getContaAreceber() {
		return contaAreceber;
	}

	public void setContaAreceber(double contaAreceber) {
		this.contaAreceber = contaAreceber;
	}

}
