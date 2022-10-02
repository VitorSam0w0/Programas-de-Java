package AtividadesparaTreino.Poo;

import java.util.Scanner;

import AtividadesparaTreino.POOsimples.numeros;
import AtividadesparaTreino.POOsimples.oPOOSimples.onumero.numero;


public class Numeros {

    public static void main(String[] args) {

        int maior, menor, maior2;

        maior = 0;



        Scanner scanner = new Scanner(System.in);

        int numeros = 5;
        int[] numeros1 = new int[numeros];

        for(int i = 0; i < numeros; ++i ) {


            System.out.println("Escreva os Numeros "+(i+1));

            numeros1[i] = scanner.nextInt();

        }

        for(int i = 0; i < numeros1.length; ++i) {

    

            if (numeros1[i] > maior) {

                maior = numeros1[i];
                maior2 = i;
                System.out.println("Teste " + maior2);
            }
               

            

        }





    }
    
}
