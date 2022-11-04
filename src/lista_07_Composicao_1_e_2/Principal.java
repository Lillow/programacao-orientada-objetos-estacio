package lista_07_Composicao_1_e_2;

/********************
 * 2. Por fim crie uma classe chamada Principal para usar os objetos conforme
 * sua composição foi planejada.
 ********************/

public class Principal {
	public static void main(String[] args) {
		Frota frotaCarro = new Frota();
		Frota frotaCaminhao = new Frota();

//		Carro
		frotaCarro.carro.modelo = "Fusca";
		frotaCarro.carro.placa = "DEF-456";
		frotaCarro.carro.fabricante.nome = "Volkswagen";
		frotaCarro.carro.fabricante.cnpj = "12.321.654/0001-91.";
		frotaCarro.carro.motor.potencia = 59333;
		frotaCarro.carro.motor.chassi = "9BW HE21j X 24060831";
		frotaCarro.carro.motor.torque = 1150;
		frotaCarro.carro.pneu.diametro = 15;
		frotaCarro.carro.pneu.medidas = 645;
		frotaCarro.carro.pneu.fabricante.nome = "Itaro";
		frotaCarro.carro.pneu.fabricante.cnpj = "61.642.521/0007-21.";

//		Caminhão
		frotaCarro.caminhao.modelo = "Mercedes-Benz";
		frotaCarro.caminhao.placa = "DWA-629";
		frotaCarro.caminhao.cabineDupla = true;
		frotaCarro.caminhao.motor.potencia = 60333;
		frotaCarro.caminhao.motor.chassi = "7BW HE12j X 82060831.";
		frotaCarro.caminhao.motor.torque = 1160;
		frotaCarro.caminhao.marcha.qtdMarcha = "10";
		frotaCarro.caminhao.marcha.tipoMarcha.cambio = 21;
		frotaCarro.caminhao.marcha.tipoMarcha.fabricante.nome = "Coronacav";
		frotaCarro.caminhao.marcha.tipoMarcha.fabricante.cnpj = "51.754.132/0009-12.";
		frotaCarro.caminhao.carroceria.tipoCarroceria = "Hatchback";
		frotaCarro.caminhao.carroceria.fabricante.nome = "Fechada";
		frotaCarro.caminhao.carroceria.fabricante.cnpj = "11.554.732/0001-81.";

	}
}
