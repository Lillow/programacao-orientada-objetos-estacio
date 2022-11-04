package lista_10_Classes_Abstratas_Interfaces_3;

/******************************
 * 3. Dado o diagrama UML da Figura 1.1, construir um programa capaz de simular
 * o funcionamento de folha de pagamento com quatro classes de trabalhadores:
 * Empregado, PorHora, PorComissao e PorHoraeComissao. A classe Empregado deve
 * ser abstrata, pois o método getPay(), que retorna o quanto cada tipo de
 * empregado deve ganhar, só poderá ser definido nas subclasses. Desse modo, a
 * classe Empregado deve ser declarada abstrata. Para todas as classes cujo
 * ganho dos trabalhadores está relacionado com a comissão relativa ao montante
 * de vendas (PorComissao e PorHoraeComissao), deve-se empregar o método
 * setVendas e a informação contida no campo COMMISSION_RATE. Por último, a
 * classe FolhadePagamento emprega objetos de todas as classes. Uma visão geral
 * do programa é dada no diagrama UML da Figura 1.1.
 ******************************/

public abstract class Empregado {
	private String name;

	public Empregado(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void printPay() {
		System.out.printf("%.2f", getPay());
	}

	public abstract double getPay();
}
