/******************************************************************************

9. Imprimir a tabuada de multiplicação do número 7 utilizando as três estruturas de repetição em java
(while, do while e for).Crie três classes cada uma com uma estrutura.

*******************************************************************************/
package lista_1;

public class TabuadaSete
{
    public static void funcaoFor(){
        int num = 7;
        
        for(int i = 1;i <=10; i++){
            num = 7 * i;
            System.out.printf("%d x %d: %d \n",i,7,num);
        }
    }
    public static void funcaoWhile(){
        int num = 7;
        int i = 0;
         
        while(i<=10){
           
            num = 7 * i;
            System.out.printf("%d x %d: %d \n",i,7,num);
            i++;
        }
    }
     public static void funcaoDoWhile(){
        int num = 7;
        int i = 0;
        
        do{
            num = 7 * i;
            System.out.printf("%d x %d: %d \n",i,7,num);
            i++;
        }while(i<=10);
    }
	public static void main(String[] args) {
		funcaoFor();
		funcaoWhile();
		funcaoDoWhile();
	}
}
