package S1Exs;
import java.util.Scanner;

public class Ex6d190822 {
    public static void main(String[] args) {

        Float litros,litrosg, km, preco;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos Km você irá Percorrer: ");
        km = scanner.nextFloat();
        System.out.println("Qual o preço Do Combustivel: ");
        preco = scanner.nextFloat();

        litros = km/13;
        litrosg = litros*preco;

        System.out.println("Você Irá Gastar: " + "R$"+litrosg);



    }
}
