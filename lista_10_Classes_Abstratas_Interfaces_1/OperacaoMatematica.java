package lista_10_Classes_Abstratas_Interfaces_1;

/******************************
 * 1. Crie uma classe abstrata OperacaoMatematica. Esta classe deve implementar
 * as operações básicas (soma, subtração, divisão e multiplicação). Crie um
 * método abstrato calcular com dois argumentos double. Crie uma classe Soma que
 * herde da classe abstrata OperacaoMatematica e gere um método que retorne a
 * soma dos dois números. Crie uma classe Subtracao que herde da classe abstrata
 * OperacaoMatematica e gere um método que retorne a sutração dos números. Por
 * fim crie uma classe Contas que tenha um método estático mostrarCalculo que
 * tenha como parámetro um objeto do tipo OperaçãoMatemática além dos dosi
 * númesos. Imprima o do cálculo. Para demonstrar o polimorfismo, crie uma
 * chamada através do método mostrarCalculo instanciando um objeto soma() e
 * passado dois parametros. Seguindo o item anterior, crie uma outra chamada ao
 * método só que será a subtração.
 ******************************/

public abstract class OperacaoMatematica {
	public abstract double calcular(double num1, double num2);
}
