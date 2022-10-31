package lista_07_questao_1_2_frota;

/*********************
 * 1. Após analisar o diagrama de classe abaixo, crie um programa em Java que
 * implemente o cenário considerando a composição entre as classes:
 *********************/

public class Frota {
	public String nome;
	public String tipo;
	public String responsavel;
	public Carro carro = new Carro();
	public Caminhao caminhao = new Caminhao();
}
