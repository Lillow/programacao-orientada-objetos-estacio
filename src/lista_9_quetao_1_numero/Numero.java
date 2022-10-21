package lista_9_quetao_1_numero;

/******************************
 * 1. Escreva uma classe tem um atributo do tipo inteiro n1 e um método chamado
 * imprimirNumero() para imprimir o valor de n1. Crie uma subclasse desta
 * primeira que também possui um atributo do tipo inteiro n2 e sobrescreva o
 * método da superclasse para imprimir o valor de n2. Em seguida crie uma classe
 * principal que tenha um objeto da subclasse e use ele para atribuir um valor a
 * n1 e a n2. Agora chame o método imprimirNumero() por este objeto e analise o
 * resultado.
 ******************************/

public class Numero {
	public int n1;

	public void imprimirNumero() {
		System.out.println(n1);
	}
}
