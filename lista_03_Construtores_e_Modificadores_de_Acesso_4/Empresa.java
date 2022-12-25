package lista_03_Construtores_e_Modificadores_de_Acesso_4;

/********************
4) Desenvolva um programa para um setor de vendas e uma empresa onde será gerado 
um objeto Pedidos que terá as seguintes características: número, data, cliente valor;
O atributo número será um atributo estático da classe para gerar um número 
incremental único para todos os pedidos gerado sempre que necessário.
Para testar, gere 3 pedidos onde o número inicie do 1 e vá até o número 3.
********************/

import java.util.Date;

public class Empresa {
	private static int cont;
	private int numero;
	private String data;
	private String cliente;
	private double valor;
	
	public Empresa(String data, String cliente, double valor) {
		cont ++;
		this.data = data;
		this.cliente = cliente;
		this.valor = valor;
		numero = cont;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


	public String toString() {
		return "Vendas [" + numero + " data=" + data + ", cliente=" + cliente + ", valor=" + valor + "]";
	}
}
