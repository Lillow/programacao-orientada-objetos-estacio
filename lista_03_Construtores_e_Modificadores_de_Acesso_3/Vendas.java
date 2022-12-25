package lista_03_Construtores_e_Modificadores_de_Acesso_3;

/*********************
 * 3. Desenvolva um programa que calcule o valor de desconto em uma operação de
 * vendas. A classe Vendas deverá ter um construtor onde o valor da variável
 * estática desconto será de 30% e haverá um método obterTaxaDeDesconto que
 * receberá um valor onde terá um teste se o valor recebido for 1, se sim, então
 * o desconto será de 10%, caso contrário o desconto será o valor do desconto já
 * informado no construtor da classe.
 *********************/

public class Vendas {
	private double desconto = 30;
	private double valor;

	public Vendas(double valor) {
		desconto = desconto / 100 * valor;
		valor = valor - desconto;
		this.valor = valor;
	}
	
	public Vendas(double valor, double desconto) {
		if(desconto == 1) {
			desconto = 10;
			this.desconto = desconto;
		}
		
		
		this.desconto = this.desconto / 100 * valor;
		this.valor = valor - desconto;
	}

	
	public String toString() {
		return "Vendas [desconto=" + desconto + ", valor=" + valor + "]";
	}

}
