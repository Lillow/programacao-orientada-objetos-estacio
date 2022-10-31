package lista_02_questao_2_retangulo;

/*********************
2. Escreva um programa em java que calcule a área e o perímetro de um retângulo 
utilizando o encapsulamento. Para isto, crie uma classe Retângulo com os atributos 
privados altura e largura. Nesta classe terá os métodos que calculam a área (altura * 
largura) e o perímetro (altura * 2) + (largura * 2). Em outra classe RetânguloTeste, 
Instancie um objeto da classe Retângulo e passe os valores da altura e largura como 
parâmetro para os métodos criados. Por fim, imprima a área e o perímetro do retângulo 
nesta segunda classe.
*********************/

public class Retangulo {
	private double heith;
	private double width;

	public Retangulo(double heith, double width) {
		this.heith = heith;
		this.width = width;
	}

	public double getHeith() {
		return heith;
	}

	public void setHeith(double heith) {
		this.heith = heith;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	public double area() {
		double a = heith * width;
		return a;
	}
	
	public double perimeter() {
		double a = (heith * 2) + (width * 2);
		return a;
	}

}
