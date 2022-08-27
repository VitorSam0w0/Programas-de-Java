package AtividadesparaTreino.Imc.Scanner;

import java.util.Scanner;

public class scanner {

    double peso, altura, imc;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Peso: ");
    peso = scanner.nextDouble();

    System.out.println("Altura: ");
    altura = scanner.nextDouble();

    imc = ( peso / ( altura * altura ) );

    System.out.println("Imc : "+imc);


    
}
