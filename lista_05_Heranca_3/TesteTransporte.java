package lista_05_Heranca_3;

public class TesteTransporte {
	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.liga();
		carro.setVelocidade(50);
		carro.setQuilometragem(300);
		
		System.out.printf("Carro ligado %B, velocidade %d, quilometragem %d", carro.getLigado(), carro.getVelocidade(), carro.getQuilometragem());
		
	}
}
