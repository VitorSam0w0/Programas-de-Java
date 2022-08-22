package S1Exs;
import java.util.Scanner;

public class Ex8d190822 {
    public static void main (String[] args) {

        int nota1, nota2, nota3, peso1, peso2, peso3, notatotal, pesototal, media, media2;
        String nome;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        nome = scanner.nextLine();
        System.out.println("Informe o Peso da primeira Prova: ");
        peso1 = scanner.nextInt();

        System.out.println("Informe o Peso da segunda Prova: ");
        peso2 = scanner.nextInt();

        System.out.println("Informe o Peso da terceira Prova: ");
        peso3 = scanner.nextInt();

        System.out.println("Informe A primeira Nota: ");
        nota1 = scanner.nextInt();

        System.out.println("Informe A Segunda Nota: ");
        nota2 = scanner.nextInt();

        System.out.println("Informe A terceira Nota: ");
        nota3 = scanner.nextInt();

        notatotal = (nota1+nota2+nota3)/3;
        pesototal = (peso1+peso2+peso3)/3;

        media = (notatotal*pesototal);


        System.out.println("A media de "+nome + " é "+media);



    }
}
