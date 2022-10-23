package lista_4_questao_2_ingresso;

/*********************
 * 2. Criar uma classe chamada Ingresso que possui um valor em reais e um método
 * imprimeValor(). Criar uma classe VIP,que herda Ingresso e possui um valor
 * adicional. Criar um método que retorne o valor do ingresso VIP(com o
 * adicional incluído). Criar uma classe Normal,que herda Ingresso e possui um
 * método que imprime:"Ingresso Normal" Criar uma classe CamaroteInferior(que
 * possui a localização do ingresso e métodos para acessar e imprimir esta
 * localização)e uma classe CamaroteSuperior,que é mais cara(possui um valor
 * adicional).Esta classe ainda possui um método para retornar o valor do
 * ingresso.Ambas as classes herdam a classe VIP. Criar uma classe
 * ComprarIngresso como sendo a principal. Nesta classe,criar o método
 * main()onde:Crie um ingresso.Peça para o usuário digitar 1 para normal e 2
 * para VIP.Conforme a escolha do usuário,diga se o ingresso é do tipo normal ou
 * VIP.Se for VIP,peça para ele digitar 1 para camarote superior e 2 para
 * camarote inferior.Conforme a escolha do usuário,reporte se a escolha VIP é
 * camarote superior ou inferior.Imprima o valor do ingresso.
 *********************/

public abstract class Ingresso {
	private float valor;

	public Ingresso(float valor) {
		this.valor = valor;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public void imprimeValor() {
		System.out.printf("R$ %.2f", valor);
	}

	public abstract void tipoIngresso();

	public abstract void imprimeAdicional();

}
