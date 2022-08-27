/*9. Dado nome, preço de compra e o preço de venda de uma mercadoria. 
  Faça um programa que mostre o nome  e o lucro em reais obtido com a venda dela. */

package S1Exs;
import java.util.Scanner;

import javax.naming.ldap.PagedResultsControl;

public class Ex9d190822 {
    public static void main(String[] args) {

        Float precocompra, precovenda, lucro;
        String nomevendedor, nomecomprador, nomemercadoria;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome do Vendedor(a): ");
        nomevendedor = scanner.nextLine();

        System.out.println("Nome do Produto: ");
        nomemercadoria = scanner.nextLine();

        System.out.println("Nome do Comprador(a); ");
        nomecomprador = scanner.nextLine();

        System.out.println("Preço da Compra do Produto: ");
        precocompra = scanner.nextFloat();

        System.out.println("Preço da Venda do Produto: ");
        precovenda = scanner.nextFloat();

        lucro = precovenda%precocompra;

        System.out.println("Você Comprou "+nomemercadoria + " por "+precocompra + " reais de " +nomevendedor);
        System.out.println("Você Vendeu Para "+nomecomprador + " por " +precovenda + " reais");
        System.out.println("Obteve o Lucro de "+lucro + " reais");


    }
}
