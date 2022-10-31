/******************************************************************************

2. A partir do algoritmo abaixo, responda:

a) Se a = verdade, b = verdade, c = falso, quais comandos serão executados?
b) Se a = false, b = verdade, c = verdade, quais comandos serão executados?
c) Se a = false, b = false, c = verdade, quais comandos serão executados?
d) Quais são os valores de a, b e c para que o comando5 e comando6 sejam executados?
e) Quais são os valores de a, b e c para que somente o comando6 seja executado?

Resposta:
a) comando1 comando6
b) comando2 comando5 comando6
c) comando5 comando6
d) se a && b == false
e) Não da

*******************************************************************************/

package lista_01;

public class AlgoritmoAbaixo {
	public static void main(String[] args) {
		boolean a, b, c;
		a = false;
		b = false;
		c = false;

		if (a) {
			System.out.println("comando1");
		} else {

			if (b) {
				if (c) {
					System.out.println("comando2");
				} else {
					System.out.println("comando3");
					System.out.println("comando4");
				}
			}
			System.out.println("comando5");
		}
		System.out.println("comando6");
	}
}
