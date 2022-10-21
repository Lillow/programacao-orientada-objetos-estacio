package lista_2_questao_2_retangulo;

public class RetanguloTeste {
	public static void main(String[] args) {
		Retangulo retangulo1 = new Retangulo (43.23, 80.54);
		Retangulo retangulo2 = new Retangulo (35.1, 70.52);
		Retangulo retangulo3 = new Retangulo (51.2, 95.0);
		
		System.out.printf("Retângulo 1 \nÁrea: %.2f \nPerímetro: %.2f \n\n",retangulo1.area(), retangulo1.perimeter());
		System.out.printf("Retângulo 2 \nÁrea: %.2f \nPerímetro: %.2f \n\n",retangulo2.area(), retangulo2.perimeter());
		System.out.printf("Retângulo 3 \nÁrea: %.2f \nPerímetro: %.2f \n\n",retangulo3.area(), retangulo3.perimeter());
	}
}
