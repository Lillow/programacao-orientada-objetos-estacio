package lista_14_Exceptions_2;

public class Divisao {
	public double calcula(double num1, double num2) throws ExcecaoDivisaoPorZero {
		if (num1 / num2 <= 0 || num1 / num2 > 999999999) {
			throw new ExcecaoDivisaoPorZero("Não é divisivel por zero!");
		} else {
			return num1 / num2;
		}
	}
}
