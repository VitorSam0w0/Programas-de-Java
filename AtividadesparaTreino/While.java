package AtividadesparaTreino;

import java.util.Scanner;

public class While {
    
public static void main (String[] args) {

    int n1, n2;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o Numero 1 ");
    n1 = scanner.nextInt();
    
    System.out.println("Digite o Numero 2 ");
    n2 = scanner.nextInt();




    while ( n1<=100 && n2<=100) {

        System.out.println("Contagem 1 " + n1 + " Contagem 2 " + n2);
        ++n1;
        ++n2;
    }

}

}
