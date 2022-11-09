package lista_15_Thread_8;

/*******************************
 * 8. Crie um fluxo paralelo para realizar uma corrida de 5 voltas onde cada
 * veículo serão os competidores e terão tempos de pitStops diferentes: (Carro
 * 1500 e Bicicleta 950) milissegundos. Inicie a corrida informando o nome do
 * veículo que largou e seu tipo. Também informe o nome de cada veículo e seu
 * tipo após realizar uma volta. Caso aconteça algum problema durante a volta
 * relate qual foi o veículo e seu tipo. Fique à vontade para sincronizar,
 * priorizar, adormecer ou até parar as threads. Também se necessário, faça com
 * que que eles aguardem por algum momento e as notifique para que voltem a
 * executar. Ao concluir a corrida, informe o veículo que terminou.
 *******************************/

public class CorridaVeiculos implements Runnable {
	private String nome;
	private String tipo;
	private int tempoPitStop;

	public CorridaVeiculos(String nome, String tipo, int tempoPitStop) {
		this.nome = nome;
		this.tipo = tipo;
		this.tempoPitStop = tempoPitStop;
	}

	public void run() {
		System.out.println(nome + tipo + " Começou...");
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + tipo + " já percorreu " + i + " voltas.");
				Thread.sleep(tempoPitStop);
			}
		} catch (InterruptedException e) {
			System.out.println(nome + tipo + " Foi interrompida.");
		}
		System.out.println(nome + " Terminou");

	}
}
