package AtividadesparaTreino;

import java.util.Scanner;

public class Notas {

    public static void main (String[] args) {

        Scanner scanner = new Scanner (System.in);

        String nome, sobrenome;

        int idade;

        double nota1, nota2, nota3, media;

        System.out.println("Nome: ");

        nome = scanner.nextLine();

        System.out.println("Sobre Nome: ");

        sobrenome = scanner.nextLine();

        System.out.println("Idade: ");

        idade = scanner.nextInt();

        System.out.println("Nota 1 : ");

        nota1 = scanner.nextDouble();

        System.out.println("Nota 2 : ");

        nota2 = scanner.nextDouble();

        System.out.println("Nota 3 : ");

        nota3 = scanner.nextDouble();

        System.out.println("Aluno(a) " + nome + " SobreNome " + sobrenome + " idade " + idade + " Nota 1 = " + nota1 + " Nota 2 = " + nota2 + " Nota 3 " + nota3);

        media = (nota1+nota2+nota3)/3;

        System.out.println("A Media é " + media);

        if (media>7) {

            System.out.println("Aluno(a) Passado(a)!!");

        } else {

            System.out.println("Aluno(a) Reprovado(a)");

        }

    }
    
}
