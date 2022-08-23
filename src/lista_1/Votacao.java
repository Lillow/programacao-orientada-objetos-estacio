/******************************************************************************

16. Escrever uma classe para fazer a apuração dos votos de uma eleição onde há quatro candidatos. Os
votos serão obtidos através dos códigos de cada candidato de acordo com a tabela abaixo. Ao
informar o código zero o algoritmo encerra.
*******************************************************************************/
package lista_1;


import java.util.Scanner;
public class Votacao
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int codigo, votosTotais = 0;
	    int[] votos = {0,0,0,0,0,0};
	    
	     do{
    	System.out.println("Digite o codigo de um candidato para votar: ");
	     codigo = sc.nextInt();
	     if(codigo >=1 && codigo <= 5){
	         votos[codigo] += 1; //votos validos e brancos
	         votosTotais+=1;
	         
	     }else{
	         votos[0] +=1; //votos nulos
	         votosTotais += 1;
	         
	     }
    	    
	     }while(codigo != 0);
        System.out.println("Votação encerrada!");
        for(int i = 0; i <= 6; i++){
            double porcentagemParcial;
            switch(i){
                case 0:
                    porcentagemParcial = (100*votos[0])/votosTotais;
                    System.out.printf("%.2f %% dos votos foram nulos com um total de %d votos", porcentagemParcial, votos[0]);
                    break;
                case 1:    
                    porcentagemParcial = (100*votos[1])/votosTotais;
                     System.out.printf("\nJose teve %.2f %% dos votos e recebeu um total de %d votos", porcentagemParcial, votos[1]);
                    break;
                case 2:    
                    porcentagemParcial = (100*votos[2])/votosTotais;
                     System.out.printf("\nMaria teve %.2f %% dos votos e recebeu um total de %d votos", porcentagemParcial, votos[2]);
                    break;
                case 3:    
                    porcentagemParcial = (100*votos[3])/votosTotais;
                     System.out.printf("\nPaulo teve %.2f %% dos votos e recebeu um total de %d votos", porcentagemParcial, votos[3]);
                    break;
                case 4:    
                    porcentagemParcial = (100*votos[4])/votosTotais;
                     System.out.printf("\nCarla teve %.2f %% dos votos e recebeu um total de %d votos", porcentagemParcial, votos[4]);
                    break;
                case 5:    
                    porcentagemParcial = (100*votos[5])/votosTotais;
                     System.out.printf("\n%.2f %% dos votos foram em branco com um total de %d votos",porcentagemParcial, votos[5]);
                    break;
            }
        }
	}
}

