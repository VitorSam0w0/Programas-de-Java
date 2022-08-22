package S1Exs;
import java.util.Scanner;

public class Ex5d190822 {
    public static void main(String[] args) {

        int hora, minuto, segundo, totalh, totalm, totals;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a hora: ");
        hora = scanner.nextInt();

        System.out.println("Digite os Minutos: ");
        minuto = scanner.nextInt();

        System.out.println("Digite Os Segundos: ");
        segundo = scanner.nextInt();

        totalh = hora*3600;
        totalm = minuto*60;
        totals = totalh+totalm+segundo;


        System.out.println("Valores: "+hora + "h " + minuto + "min " + segundo + "seg");
        System.out.println("Em Segundos: "+totals);

    }
}
