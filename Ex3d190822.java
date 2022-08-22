package S1Exs;
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
