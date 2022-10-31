/******************************************************************************

17. Escreva uma classe que receberá o nome e o salário de cinco funcionários e aplique o reajuste salarial
de acordo com a tabela abaixo. Ao final informe o salário anterior, o valor que será acrescido após
aplicar o percentual de reajuste e também informe o novo valor de salário de cada funcionário.
Também informe qual o valor total que a empresa terá a mais em sua folha de pagamento após
somar todos os reajustes.

*******************************************************************************/
package lista_01;

import java.util.Scanner;
public class Salarios
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nomes[] = new String[5];
		double salarios[] = new double[5];
		double salariosNovos[] = new double[5];
		double aumentos[] = new double[5];
        double gastoInicial = 0, gastoFinal = 0;
        
		for(int i = 0; i < 5; i++){
		    System.out.printf("Digite o nome do %d° funcionario: \n", i+1);
		    nomes[i] = sc.next();
		    System.out.printf("Digite o salario de %s: \n", nomes[i]);
		    salarios[i] = sc.nextDouble();
		   
		    gastoInicial += salarios[i];
		   
		    if(salarios[i] > 1800){
		        salariosNovos[i] = salarios[i] + (salarios[i]*0.0572);
		    } else if(salarios[i] > 1350){
		        salariosNovos[i] = salarios[i] + (salarios[i]*0.0896);
		    }else if(salarios[i] > 1050){
		        salariosNovos[i] = salarios[i] + (salarios[i]*0.1005);
		    }else if(salarios[i] > 850){
		        salariosNovos[i] = salarios[i] + (salarios[i]*0.1296); // 100% = 1 / 10% 0.1 / 5% 0.05
		    }else if(salarios[i] > 720){
		        salariosNovos[i] = salarios[i] + (salarios[i]*0.1550);
		    } else{
		        salariosNovos[i] = salarios[i] + (salarios[i]*0.2074);
		    }
		    aumentos[i] = salariosNovos[i] - salarios[i];
		    gastoFinal += salariosNovos[i];
		}
		
		for(int i = 0; i < 5; i++){
		    System.out.printf("%s recebia %.2f , mas teve um aumento de %.2f e agora recebe %.2f \n", nomes[i], salarios[i], aumentos[i], salariosNovos[i]);
		}
		System.out.printf("A empresa tera um gasto de %.2f a mais", (gastoFinal - gastoInicial));
	}
}



