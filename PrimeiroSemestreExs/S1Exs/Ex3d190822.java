/*3. A área de um círculo é medida pela seguinte fórmula: Área = PI * (R*R).
  Sabendo disso, faça um programa  que peça para o usuário digitar o valor (R)aio,
  e após, calcule e mostre na tela a área do círculo.
  Observação:  Considere que o valor de PI seja igual a 3.1415. */

package PrimeiroSemestreExs.S1Exs;
import java.util.Scanner;

public class Ex3d190822 {
    public static void main(String[] args) {

        Float area, raio, pi;
        pi = 3.1415f;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Raio do circulo: ");
        raio = scanner.nextFloat();

        area = pi*(raio*raio);

        System.out.println("Area Total: "+area);


    }
}
