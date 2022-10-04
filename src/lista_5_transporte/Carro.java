package lista_5_transporte;

public class Carro extends Transporte {
	private int quilometragem;

	public int getQuilometragem() {
		return quilometragem;
	}

	public void setQuilometragem(int quilometragem) {
		if (quilometragem < 999999 && quilometragem > 0) {
			this.quilometragem = quilometragem;
		}
		
		else{
			System.out.println("Valor inválido!");
		}
	}

}
