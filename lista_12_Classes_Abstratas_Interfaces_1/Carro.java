package lista_12_Classes_Abstratas_Interfaces_1;

public class Carro extends TransporteTerrestre implements Motorizado, Conduzivel {
	private int numeroCilindros;

	public boolean estaParado() {
		return getVelocidadeAtual() == 0 ? true : false;
	}

	public void estacionar() {
		System.out.println("Estacionando.");
	}

	public void curvar(float angulo) {
		System.out.println("Curva " + angulo + "°");
	}

	public void abastecer(int qtdLitros) {
		System.out.println("Abasteceu " + qtdLitros + "L");
	}

	public void ligarMotor() {
		System.out.println("Motor ligado");
	}

	public void embreiar() {
		System.out.println("Embreiando");
	}

}
