package lista_12_Classes_Abstratas_Interfaces_1;

public class Teste {

	public static void main(String[] args) {
		Aviao aviao = new Aviao();

		aviao.setNome("Avião");
		System.out.println(aviao.getNome());
		aviao.setNumeroPassageiro(407);
		aviao.setNumeroMotores(4);
		aviao.abastecer(300000);
		aviao.ligarMotor();
		aviao.setVelocidadeAtual(200);
		aviao.setAltitudeAtual(250);
		aviao.subir(20);
		aviao.descer(60);
		aviao.curvar(20);

		System.out.println("NumeroPassageiro: " + aviao.getNumeroPassageiro());
		System.out.println("Velocidade Atual: " + aviao.getVelocidadeAtual());
		System.out.println("Altitude Atual: " + aviao.getAltitudeAtual());
		System.out.println("Está Parado: " + aviao.estaParado());
		System.out.println();

		Balao balao = new Balao();

		balao.setNome("Balão");
		System.out.println(balao.getNome());
		balao.setNumeroPassageiro(4);
		balao.setVelocidadeAtual(50);
		balao.setAltitudeAtual(90);
		balao.aquecerAr(10);
		balao.largarPeso(6);
		balao.subir(10);
		balao.descer(20);

		System.out.println("NumeroPassageiro: " + balao.getNumeroPassageiro());
		System.out.println("Velocidade Atual: " + balao.getVelocidadeAtual());
		System.out.println("Altitude Atual: " + balao.getAltitudeAtual());
		System.out.println("Está Parado: " + balao.estaParado());
		System.out.println("Peso largado" + balao.getPesoLargard());
		System.out.println();

		Carro carro = new Carro();

		carro.setNome("Carro");
		System.out.println(carro.getNome());
		carro.setNumeroPassageiro(5);
		carro.setVelocidadeAtual(0);
		carro.setTipo("asdf");
		carro.estacionar();
		carro.abastecer(20);
		carro.ligarMotor();
		carro.embreiar();

		System.out.println("NumeroPassageiro: " + carro.getNumeroPassageiro());
		System.out.println("Velocidade Atual: " + carro.getVelocidadeAtual());
		System.out.println("Está Parado: " + carro.estaParado());
		System.out.println();

		Bicicleta bicicleta = new Bicicleta();

		bicicleta.setNome("Bicicleta");
		System.out.println(bicicleta.getNome());
		bicicleta.setNumeroPassageiro(1);
		bicicleta.setVelocidadeAtual(5);
		bicicleta.setTipo("asdf");
		bicicleta.pedalar();
		bicicleta.pedalar();
		bicicleta.pedalar();

		System.out.println("NumeroPassageiro: " + bicicleta.getNumeroPassageiro());
		System.out.println("Velocidade Atual: " + bicicleta.getVelocidadeAtual());
		System.out.println("Está Parado: " + bicicleta.estaParado());
		System.out.println();

	}

}
