package lista_03_questao_4_empresa;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Vendas {
	public static void main(String[] args) {
		Empresa cliente1 = new Empresa("13/09/2022", "Lúcia", 120.21);
		Empresa cliente2 = new Empresa("05/04/2021", "Vera", 340.55);
		Empresa cliente3 = new Empresa("11/12/2020", "Paula", 321.05);

		System.out.println(cliente1.toString());
		System.out.println(cliente2.toString());
		System.out.println(cliente3.toString());



	}

}
