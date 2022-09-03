/*2. Faça um programa para ler a base e a altura de um triângulo. 
     Em seguida, escreva a área dele. Obs.: Área = (Base * Altura) / 2 */

package PrimeiroSemestreExs.S1Exs;
import java.util.Scanner;

public class Ex2d190822 {
    public static void main(String[] args) {

        Float base, altura, area;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Base do triângulo: ");
        base = scanner.nextFloat();

        System.out.println("Altura do triângulo: ");
        altura = scanner.nextFloat();

        area = (base*altura)/2;

        System.out.println("Area do triângulo Igual a: "+area);

    }
}
