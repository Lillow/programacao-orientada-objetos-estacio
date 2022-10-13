package lista_5_equipamento;

public class EquipamentoSonoro extends Equipamento {
	private static short volume;
	private boolean stereo;

	public void liga() {
		setLigado(true);
		volume = 5;

	}

	public void Desliga() {
		setLigado(false);

	}

	public boolean isStereo() {
		return stereo;
	}

	public void mono() {
		this.stereo = true;
	}

	public void stereo(boolean stereo) {
		this.stereo = stereo;
	}
	
	public short getVolume() {
		return volume;
	}
	
	public void aumentaVolume() {
		if(volume >= 0 && volume < 10) {
			volume ++;
			
		}
	}
	
	public void abaixaVolume() {
		if(volume > 0 && volume <= 10) {
			volume --;
			
		}
	}

}
