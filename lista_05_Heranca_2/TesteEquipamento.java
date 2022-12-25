package lista_05_Heranca_2;

public class TesteEquipamento {
	public static void main(String[] args) {
		EquipamentoSonoro equipamento1 = new EquipamentoSonoro();

		equipamento1.liga();
		equipamento1.mono();
		System.out.println("Ligado = " + equipamento1.isLigado());
		System.out.println("Stereo = " + equipamento1.isStereo());

		equipamento1.aumentaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
		equipamento1.aumentaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
		equipamento1.aumentaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
		equipamento1.aumentaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
		equipamento1.aumentaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
		equipamento1.aumentaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
		
		equipamento1.abaixaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
		equipamento1.abaixaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
		equipamento1.abaixaVolume();
		System.out.println("Volume = " + equipamento1.getVolume());
	}
}
