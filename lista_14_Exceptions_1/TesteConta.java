package lista_14_Exceptions_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TesteConta {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CadastroContas conta = new CadastroContas();

		String cliente, fornecedor;
		int numConta;
		double contaApagar;
		double contaAreceber;
		try {
			System.out.println("Cliente: ");
			cliente = scan.next();

			System.out.println("Fornecedor: ");
			fornecedor = scan.next();

			System.out.println("Número Conta: ");
			numConta = scan.nextInt();

			System.out.println("Conta Apagar: ");
			contaApagar = scan.nextDouble();

			System.out.println("Número Conta: ");
			contaAreceber = scan.nextDouble();
			conta.inserir(cliente, fornecedor, numConta, contaApagar, contaAreceber);
			conta.buscar(numConta);

		} catch (ExcecaoContaJaExistente e) {
			System.out.println(e.getMessage());
		} catch (ExcecaoCadastroCheio e) {
			System.out.println(e.getMessage());
		} catch (ExcecaoContaInexistente e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Excecao Dado Inválido");
		}

	}
}
