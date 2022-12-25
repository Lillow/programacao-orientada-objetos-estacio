package lista_07_Composicao_1_e_2;

public class Carro {
	public String modelo;
	public String placa;
	public Fabricante fabricante = new Fabricante();
	public Motor motor = new Motor();
	public Pneu pneu = new Pneu();
}
