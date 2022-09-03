package CursoDeJava.ImcSimples;
import java.util.Scanner;

public class Imc1 {

    public static void main ( String[] args ) {

        Double peso, altura, imc;

        String valorfinal;

        Scanner scanner = new Scanner ( System.in );

        System.out.println("Peso: ");
        peso = scanner.nextDouble();

        System.out.println("Altura: ");
        altura = scanner.nextDouble();

        imc = ( peso / ( altura * altura ) );

        System.out.println("O Imc é: "+imc);

        if (imc > 18 ) valorfinal = "Magresa";
        else if (imc > 25) valorfinal = "Normal";
        else if (imc > 29) valorfinal = "Obessidade";
        else if (imc > 39) valorfinal = "Obessidade Grave";
        else valorfinal = "Obessidade Morbida Procure Um Médico!";

        System.out.println("A Categoria do Sei imc é: "+valorfinal);

    }


}
