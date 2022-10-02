/*10. Dado nome do vendedor, quantidade de unidades do produto que o mesmo vendeu durante o mês 
  e o preço  unitário do produto, faça um programa que mostre nome do vendedor e o valor total obtido com as vendas.  
  Considere a venda de um único item. */

package PrimeiroSemestreExs.S1Exs;
import java.util.Scanner;

public class Ex10d190822 {
    public static void main(String[] args) {


        String nomevendedor;
        double preco, total, produto;

        
//não esquecer de fazer as outras variaveis

        Scanner scanner = new Scanner(System.in);

        System.out.println("  Digite O Nome do Vendedor: ");
        nomevendedor = scanner.nextLine();

        System.out.println("Quantidade de Produtos Vendida");
        produto = scanner.nextDouble();

        System.out.println("Preço do produto: ");
        preco = scanner.nextDouble();

        total = (produto*preco);

      System.out.println("O Vendedor(a) "+ nomevendedor + " Vendeu " + total + " Em Produtos " );



    }
}
