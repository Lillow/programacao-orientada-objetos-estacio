package lista_4_questao_1_imovel;

/*********************
 * 1. Criar a classe Imovel, que possui um endereço e um preço. • Criar uma
 * classe Novo, que herda Imovel e possui um adicional no preço. • Criar métodos
 * de acesso e impressão deste valor adicional. • Criar uma classe Usado, que
 * herda Imovel e possui um desconto no preço. • Criar métodos de acesso e
 * impressão para este desconto. • Criar uma classe de VendaImovel com o método
 * main(). • Neste método: Crie um imóvel. Peça para o usuário digitar 1 para
 * novo e 2 para usado. Conforme a definição do usuário e imprima o valor final
 * do imóvel.
 *********************/

public class Imovel {
	private String endereco;
	private double preco;

	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}

}
