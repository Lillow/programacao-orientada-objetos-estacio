package lista_05_questao_3_transporte;

public class TesteTransporte {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.liga();
		carro.setVelocidade(50);
		carro.setQuilometragem(300);
		
		System.out.printf("Carro ligado %B, velocidade %d, quilometragem %d", carro.getLigado(), carro.getVelocidade(), carro.getQuilometragem());
		
	}
}
