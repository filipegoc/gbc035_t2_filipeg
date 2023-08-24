import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String[] nome = new String[4];
        float[] preco = new float[4];
        int[] estoque = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Informe o nome do produto " + (i + 1) + ":");
            nome[i] = input.nextLine();

            System.out.println("Informe o preço do produto " + (i + 1) + ":");
            preco[i] = input.nextFloat();

            System.out.println("Informe a quantidade em estoque do produto " + (i + 1) + ":");
            estoque[i] = input.nextInt();
            
            input.nextLine();
        }
        
        preco[0] = alteraPrecoPorcentagem(preco[0], 10);
        preco[2] = alteraPrecoPorcentagem(preco[2], 10);
        System.out.println("\nAumentando o preco em 10% do produto 1 e 3: " + preco[0] + " e "+ preco[2]);
        preco[1] = alteraPrecoPorcentagem(preco[1], -5);
        System.out.println("\nReduzindo o preco em 5% do produto 2: " + preco[1]);
        preco[3] = alteraPrecoPorcentagem(preco[3], 50);
        System.out.println("\nAlterando o preco do prod. 4: " + preco[3]);
        
        System.out.println("\nProdutos Cadastrados:");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nProduto: " + nome[i] + "\nPreço: " + preco[i] + "\nEstoque: " + estoque[i]);
        }

    }

    public static float alteraPrecoPorcentagem(float preco, float porcentagem) {
        float temp = 1 + porcentagem / 100;
        return preco * temp;
    }
}