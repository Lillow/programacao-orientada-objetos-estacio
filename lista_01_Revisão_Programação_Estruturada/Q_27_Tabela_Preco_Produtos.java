package lista_01_Revisão_Programação_Estruturada;

/***********************************************
Fazer um programa que cria uma estrutura de tabela de preço de produtos contendo os elementos, 
código do produto, nome do produto, preço do produto, desconto do produto. Em seguida criar uma 
variável desta estrutura que será um Array de 5 elementos. Após isto, alimente esta estrutura de 
registro com os dados de acordo com cada atributo. Ao final faça uma leitura dos valores desta 
estrutura e imprima a média de todos os preços.
***********************************************/
Public class Q_27_Tabela_Preco_Produtos{
	public static void main(String[] args) {
        // criar uma matriz de 5 elementos para armazenar a tabela de preço
        String[][] tabela = new String[5][4];
        
        // preencher a tabela de preço com os dados de cada produto
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < tabela.length; i++) {
            System.out.println("Digite o código do produto " + (i+1) + ": ");
            tabela[i][0] = sc.nextLine();
            System.out.println("Digite o nome do produto " + (i+1) + ": ");
            tabela[i][1] = sc.nextLine();
            System.out.println("Digite o preço do produto " + (i+1) + ": ");
            tabela[i][2] = sc.nextLine();
            System.out.println("Digite o desconto do produto " + (i+1) + ": ");
            tabela[i][3] = sc.nextLine();
        }
        
        // calcular a média dos preços dos produtos
        double somaPreco = 0;
        for (int i = 0; i < tabela.length; i++) {
            double preco = Double.parseDouble(tabela[i][2]);
            somaPreco += preco;
        }
        double mediaPreco = somaPreco / tabela.length;
        
        // imprimir a tabela de preço e a média dos preços dos produtos
        System.out.println("\nCódigo\tNome\tPreço\tDesconto");
        for (int i = 0; i < tabela.length; i++) {
            System.out.println(tabela[i][0] + "\t" + tabela[i][1] + "\t" + tabela[i][2] + "\t" + tabela[i][3]);
        }
        System.out.println("\nA média dos preços dos produtos é: " + mediaPreco);
    }
}