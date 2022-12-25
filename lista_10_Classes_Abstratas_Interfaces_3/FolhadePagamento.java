package lista_10_Classes_Abstratas_Interfaces_3;

public class FolhadePagamento {

	public static void main(String[] args) {
		Empregado emp1 = new PorComissao("Lúcia", 500.80);
		System.out.println("Nome: " + emp1.getName());
		System.out.print("Total a receber: R$ ");
		emp1.printPay();
		System.out.println("\n");

		Empregado emp2 = new PorHora("Márcia", 40.20, 8);
		System.out.println("Nome: " + emp2.getName());
		System.out.print("Total a receber: R$ ");
		emp2.printPay();
		System.out.println("\n");

		Empregado emp3 = new PorHoraeComissao("André", 30.50, 6, 200);
		System.out.println("Nome: " + emp3.getName());
		System.out.print("Total a receber: R$ ");
		emp3.printPay();
		System.out.println("\n");
	}

}
