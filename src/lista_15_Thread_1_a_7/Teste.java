package lista_15_Thread_1_a_7;

public class Teste {

	public static void main(String[] args) {
		Bicicleta caloi = new Bicicleta("Chassi A", 40, 4);
		Bicicleta trek = new Bicicleta("Chassi B", 50, 2);
		Carro fiat = new Carro("Cassi C", 200, 20);
		Carro bmw = new Carro("Chassi D", 300, 30);

		Oficina oficina = new Oficina();
		oficina.adicionarVeiculoFila(caloi);
		oficina.adicionarVeiculoFila(fiat);
		oficina.adicionarVeiculoFila(bmw);
		oficina.adicionarVeiculoFila(trek);

		for (int i = 1; i < 5; i++) {
			oficina.atenderProximo();
		}
	}
}
