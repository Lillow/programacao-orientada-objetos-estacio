package lista_10_Classes_Abstratas_Interfaces_1;

public class Contas {

	public static void mostrarCalculo(OperacaoMatematica opM, double num1, double num2) {
		System.out.println(opM.calcular(num1, num2));
	}

	public static void main(String[] args) {
		Soma soma = new Soma();
		Subtracao sub = new Subtracao();

		mostrarCalculo(soma, 35, 7);
		mostrarCalculo(sub, 55, 13);

	}
}
