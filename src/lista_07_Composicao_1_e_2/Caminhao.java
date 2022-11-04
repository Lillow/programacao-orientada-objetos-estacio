package lista_07_Composicao_1_e_2;

public class Caminhao {
	public String modelo;
	public String placa;
	public boolean cabineDupla;
	public Motor motor = new Motor();
	public Marcha marcha = new Marcha();
	public Carroceria carroceria = new Carroceria();
}
