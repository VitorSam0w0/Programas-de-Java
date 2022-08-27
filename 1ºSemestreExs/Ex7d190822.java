/*7. Escrever um programa que leia o nome de um aluno
  e as notas das 3 provas que ele obteve no semestre. 
  No  final informar o nome do aluno e a sua média (aritmética).*/

package S1Exs;
import java.util.Scanner;
public class Ex7d190822 {
    public static void main(String[] args) {

        String nome;
        int media, nota1, nota2, nota3;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nome: ");
        nome = scanner.nextLine();

        System.out.println("Nota 1: ");
        nota1 = scanner.nextInt();

        System.out.println("Nota 2: ");
        nota2 = scanner.nextInt();

        System.out.println("Nota 3: ");
        nota3 = scanner.nextInt();

        media = (nota1+nota2+nota3)/3;

        System.out.println("A Média de "+nome + " é "+media);

    }
}
