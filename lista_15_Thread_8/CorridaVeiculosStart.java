package lista_15_Thread_8;

public class CorridaVeiculosStart {

	public static void main(String[] args) {
		CorridaVeiculos t1 = new CorridaVeiculos("Caloi", " bicicleta", 950);
		CorridaVeiculos t2 = new CorridaVeiculos("Trek", " bicicleta", 950);
		CorridaVeiculos t3 = new CorridaVeiculos("Fiat", " carro", 1500);
		CorridaVeiculos t4 = new CorridaVeiculos("Bmw", " carro", 1500);
		Thread t1_1 = new Thread(t1);
		Thread t2_2 = new Thread(t2);
		Thread t3_3 = new Thread(t3);
		Thread t4_4 = new Thread(t4);
		t1_1.start();
		t2_2.start();
		t3_3.start();
		t4_4.start();
		do {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.out.println("foi interrompida.");
			}
		} while (t1_1.isAlive() || t2_2.isAlive() || t3_3.isAlive() || t4_4.isAlive());
		System.out.println("!!!!!! A CORRIDA FINALIZOU !!!!!!");
	}
}
