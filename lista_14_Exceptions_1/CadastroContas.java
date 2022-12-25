package lista_14_Exceptions_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CadastroContas {

	public Conta inserir(String cliente, String fornecedor, int numConta, double contaApagar, double contaAreceber)
			throws ExcecaoCadastroCheio, ExcecaoContaJaExistente {
		if (existeConta(false)) {
			System.out.println("Inserida com sucesso!");
		} else if (cadrastroCheio(true)) {
			throw new ExcecaoCadastroCheio("Excecao Cadastro Cheio");
		} else {
			throw new ExcecaoContaJaExistente("Excecao Conta Ja Existente");
		}
		return null;
	}

	public Conta buscar(int numConta) throws ExcecaoContaInexistente {
		if (buscarConta(false)) {
			System.out.println("Achou conta!");
		} else {
			throw new ExcecaoContaInexistente("Excecao Conta Inexistente");
		}
		return null;
	}

	private boolean existeConta(boolean existeConta) {
		return existeConta;
	}

	private boolean cadrastroCheio(boolean cheio) {
		return cheio;
	}

	private boolean buscarConta(boolean temConta) {
		return temConta;
	}

}
