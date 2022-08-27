package CursoDeJava;
import java.util.Scanner;
public class Imc1 {
    public static void main (String[] args) {

        float peso, altura, imc;
        String  classific = "";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre Com o Peso: ");
        peso = scanner.nextFloat();

        System.out.println("Entre Com a Altura: ");
        altura = scanner.nextFloat();


        imc = (peso/(altura*altura));

        System.out.println("O imc é: "+imc);

        if ( imc < 18.5 ) classific = "Magressa";
        else if (imc < 24.9) classific = "Normal";
        else if (imc < 29.9) classific = "SobrePeso";
        else if (imc < 39.9) classific = "Obessidade";
        else classific = "Obesidade Grave";
        System.out.println("A Classificação é: "+classific);
    }
}
