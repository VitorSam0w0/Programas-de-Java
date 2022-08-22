public class Array {
    public static void main (String[] args) {

        int[] teste;
        int teste1 = 3;
        teste = new int[teste1];

        teste[0] = 5;
        teste[1] = 10;
        teste[2] = 15;

        for(int n: teste) {
            System.out.println(n);
        }

    }
}