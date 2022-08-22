package S1Exs;
import  java.util.Scanner;

public class Ex4d190822 {
    public static void main(String[] args) {

        Double graus, subtrair, dividir; 

        Scanner scanner = new Scanner(System.in);
        System.out.println("fahrenheit: ");
        graus = scanner.nextDouble();

        dividir = (graus*1.8)+32;

        System.out.println("Fica "+dividir + " em Graus Celsius");

    }
}
