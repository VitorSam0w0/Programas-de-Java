/*1. Faça um programa para ler as seguintes informações de uma pessoa:
     Nome, Idade, Sexo, Peso, Telefone.*/

package S1Exs;
import java.util.Scanner;
public class Ex1d190822 {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int idade;
        double peso;
        String nome, telefone, sexo;

        System.out.println("Nome: ");
        nome = scanner.next();

        System.out.println("Idade: ");
        idade = scanner.nextInt();

        System.out.println("Peso: ");
        peso = scanner.nextFloat();

        System.out.println("Sexualidade: ");
        sexo = scanner.nextLine();

        System.out.println("Telefone: ");
        telefone = scanner.nextLine();

        System.out.println("Nome: " + nome + " Idade: " + idade + " Peso: " + peso + " Sexualidade: " + sexo + " Telefone: " + telefone);
    
    }

}
